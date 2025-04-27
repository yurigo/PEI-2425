package manager;

import dao.PersonajeDAO;
import model.Personaje;

import java.util.List;

public class PersonajeManager {

    private PersonajeDAO personajeDAO;

    public PersonajeManager() {
        this.personajeDAO = new PersonajeDAO();
    }

    public List<Personaje> obtenerHeroes(String rutaArchivo) {
        return personajeDAO.leerHeroesDesdeArchivo(rutaArchivo);
    }

    public void guardarHeroes(String rutaArchivo, List<Personaje> heroes){
        personajeDAO.guardarHeroesAArchivo(rutaArchivo, heroes);
    }
}