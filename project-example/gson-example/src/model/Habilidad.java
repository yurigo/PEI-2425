package model;

public class Habilidad {
    private String nombre;
    private int nivelRequerido;
    private String descripcion;

    @Override
    public String toString() {
        return "Habilidad{" + "\n" +
                "    nombre='" + nombre + '\'' + "\n" +
                "    nivelRequerido=" + nivelRequerido + "\n" +
                "    descripcion='" + descripcion + '\'' + "\n" +
                "  }" + "\n";
    }

    // Getters y setters
}
