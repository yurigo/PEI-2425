package animals;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void talk() {
        System.out.println("Chirp chirp");
    }
}
