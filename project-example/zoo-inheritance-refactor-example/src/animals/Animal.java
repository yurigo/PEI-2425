package animals;

public class Animal {

    private String name;
    private int age;
    private int weight;
    private int height;
    private String color;

    public Animal(String name) {
        this.name = name;
    }

    public void talk() {
        System.out.println("El animal habla");
    }


}
