public class Controller {

    private Menu menu;

    public Controller(Menu m) {
        this.menu = m;
    }

    public void run(){
        System.out.println("Hello, World!");
        this.menu.showMenu();
        this.menu.showMenu();
        Integer i = this.menu.getInteger("Pide un numero:");

    }
}
