package model;

public class Item {
    private String nombre;
    private String tipo;
    private int valor;

    @Override
    public String toString() {
        return "Item{" + "\n" +
                "    nombre='" + nombre + '\''  + "\n" +
                "    tipo='" + tipo + '\'' + "\n" +
                "    valor=" + valor + "\n" +
                "  }" + "\n";
    }

    // Getters y setters
}
