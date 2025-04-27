import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course c = new Course();
        c.setYear(2020);

        Course c2 = new Course(4000);

        Course c3 = new Course(new Date());

    }
}