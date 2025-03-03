package animals;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private int height;
    private String color;

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age, int weight, int height, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public void showData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
    }

    public void talk(){
        System.out.println("Woof woof");
    }
}
