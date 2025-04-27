public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void habla() {
        System.out.println("Woof woof");
    }
}