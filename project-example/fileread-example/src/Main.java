import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Nombre del archivo que deseas leer
        String nombreArchivo = "archivo.txt";

        try {
            // Crear un objeto FileReader para leer el archivo
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Inicializar contador de palabras
            int contadorPalabras = 0;

            String linea;
            // Leer el archivo línea por línea
            while ((linea = bufferedReader.readLine()) != null) {
                // System.out.println(linea);
                // Dividir la línea en palabras utilizando espacios como delimitadores
                String[] palabras = linea.split(" ");
                // Incrementar el contador de palabras por la cantidad de palabras en la línea
                contadorPalabras += palabras.length;
            }

            // Cerrar el FileReader
            bufferedReader.close();

            // Mostrar el resultado
            System.out.println("El archivo " + nombreArchivo + " contiene " + contadorPalabras + " palabras.");

        } catch (IOException e) {
            // Manejo de excepción en caso de errores de lectura
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
