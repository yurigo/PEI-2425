import java.util.Scanner;

public class MenuConsola extends Menu {
    public void showMenu() {
        System.out.println("Welcome to Menu");
        System.out.println("Please select one of the following options:");
        System.out.println("1. Add Item");
        System.out.println("2. Add Item");
        System.out.println("3. Delete Itemv");
    }

    public Integer getInteger(String text){
        System.out.println(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
