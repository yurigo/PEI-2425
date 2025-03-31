import animals.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Dog o = new Dog("Alice");
        Dog g = new Dog("Bob");
        Cat c = new Cat("Avogato");
        Bird b = new Bird("Charlie");
        Capybara capi = new Capybara("Lorem");
        Sheep sheep = new Sheep("Dolly");

//        g.talk();
//        c.talk();
//        b.talk();
//        capi.talk();

//        ArrayList<Dog> dogs = new ArrayList<Dog>();
//        dogs.add(o);
//        dogs.add(g);

//        for (int i = 0; i < dogs.size(); i++) {
//            dogs.get(i).talk();
//        }
//
//        dogs.forEach(dog -> {
//            dog.talk();
//        });
//
//        for (Dog d : dogs) {
//            d.talk();
//        }

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(o);
        animals.add(g);
        animals.add(c);
        animals.add(b);
        animals.add(capi);
        animals.add(sheep);

        for(Animal a : animals) {
            a.talk();
        }



    }
}