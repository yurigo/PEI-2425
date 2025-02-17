public class Main
{
    public static void main(String[] args) {

        User a = new User("Alice" , 40);
        User b = new User("Bob" , 40);
        User c = new User("Charlie" , 40);

        a.addFollower(b);
        a.addFollower(c);

        b.addFollower(c);

        a.showInfo();
        b.showInfo();
        c.showInfo();

    }
}