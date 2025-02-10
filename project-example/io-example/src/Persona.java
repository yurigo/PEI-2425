public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // DRY -> Don't repeat yourself.
    // SOLID
    // KISS

    private String nombreCompleto(){
        //return nombre + " " + apellido;
        return apellido + ", " + nombre;
    }

    public void showBienvenida(){

        if (this.nombre.equals("Yuri") ){
            System.out.println("Hola, " + nombreCompleto() + "!!1  Bienvenid@!!  Por cierto, te llamas igual que mi profe de PEI");
        }
        else {
            System.out.println("Hola, " + nombreCompleto() + "!!1  Bienvenid@ a mi aplicacion que pregunta el nombre y el apellido y no hago nada más!!");
        }
    }
}
