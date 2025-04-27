public class Person {
    private Heart heart;

    public Person() {
        this.heart = new Heart();
    }

    public void beatHeart() {
        heart.beat();
    }
}