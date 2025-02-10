import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.print("¿Y tu apellido? ");
        String apellido = sc.nextLine();

        Persona p = new Persona(nombre, apellido);

        p.showBienvenida();
    }
}