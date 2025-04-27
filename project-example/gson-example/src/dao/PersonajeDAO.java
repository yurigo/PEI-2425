package dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
// import com.google.gson.reflect.TypeToken;
import model.Personaje;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.lang.reflect.Type;
import java.util.List;
import java.util.Arrays;

public class PersonajeDAO {

    public List<Personaje> leerHeroesDesdeArchivo(String rutaArchivo) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            // Type listaPersonajesType = new TypeToken<List<Personaje>>(){}.getType();
            // return gson.fromJson(reader, listaPersonajesType);
            Personaje[] personajesArray = gson.fromJson(reader, Personaje[].class);
            return Arrays.asList(personajesArray);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
    }

    public void guardarHeroesAArchivo(String rutaArchivo, List<Personaje> personajes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(personajes, writer);
            System.out.println("Héroes guardados correctamente en: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar los héroes: " + e.getMessage());
        }
    }
}
