public class Main {

    public static void main(String[] args) {

        System.out.println("voy a intentar dividir 10 entre 0");
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("el resultado es: " + c);

        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Sigo funcionando");

    }
}