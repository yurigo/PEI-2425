package model;

import java.util.List;

public class Personaje {
    private String nombre;
    private int nivel;
    private String clase;
    private Estadisticas estadisticas;
    private List<Item> inventario;
    private List<Habilidad> habilidades;

    @Override
    public String toString() {
        return "Personaje{" + "\n" +
                "  nombre='" + nombre + '\'' + "\n" +
                "  nivel=" + nivel +  "\n" +
                "  clase='" + clase + '\'' +  "\n" +
                "  estadisticas=" + estadisticas +  "\n" +
                "  inventario=" + inventario + "\n" +
                "  habilidades=" + habilidades +  "\n" +
                '}' + "\n";
    }

    // Getters y setters

    public void levelUp(){
        this.nivel +=1;
    }
}