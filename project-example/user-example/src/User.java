import java.util.ArrayList;

public class User {
    private String name;
    private Integer age;
    private boolean premium;
    private ArrayList<User> followers;

    public String getName() {
        return this.name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.followers = new ArrayList<User>();
    }

    public boolean isPremium() {
        return this.premium;
    }

    public void addFollower(User that) {
        this.followers.add(that);
    }

    public void showInfo() {
        System.out.println("Nombre");
        System.out.println(name);
        System.out.println("Edad");
        System.out.println(age);
        System.out.println("Followers");
        System.out.println(this.followers);  // mostrará la informacion del nombre de la clase y la dirección en memoria.


        for (int i = 0; i < this.followers.size(); i++) {
            System.out.println("Follower " + i + ": ");
            this.followers.get(i).showInfo();  // cuidado con los ciclos
        }

    }
}
