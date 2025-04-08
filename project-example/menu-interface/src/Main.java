public class Main {
    public static void main(String[] args) {
        // MenuConsola m = new MenuConsola();
        Menu m = new MenuRV();

        Controller c = new Controller(m);
         c.run();

    }
}