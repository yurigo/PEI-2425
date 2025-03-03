import animals.Bird;
import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Dog d = new Dog("Bob", 44, 300, 12, "black");
        d.talk();
        d.showData();

        d.setAge(45);

        Cat c = new Cat();
        c.talk();

        Bird b = new Bird();
        b.talk();

        Dog k = new Dog("Charlie", 11, 11, 11, "white");
        k.talk();
        k.showData();

    }
}