import java.awt.*;

public class MenuWindow extends Menu {
    public void showMenu() {
        // abro una ventana y pongo dentro el menu...
        System.out.println("** Menu Window");
        System.out.println("** Welcome to Menu");
        System.out.println("** Please select one of the following options:");
        System.out.println("** 1. Add Item");
        System.out.println("** 2. Add Item");
        System.out.println("** 3. Delete Itemv");
    }

    public Integer getInteger(String text){
        // abro una ventana con un textbox que pida un numero...
        System.out.println("*** " + text + "***");
        return 4;
    }
}
