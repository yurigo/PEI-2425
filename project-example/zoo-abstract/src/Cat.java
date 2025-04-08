public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    public void habla() {
        System.out.println("Meow meow");
    }
}
