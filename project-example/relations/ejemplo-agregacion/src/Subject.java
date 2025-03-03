import java.util.ArrayList;

public class Subject {
    private String id;
    private String name;
    private int ects;
    private ArrayList<Course> courses;

    public Subject() {
        this.courses = new ArrayList<Course>();
    }

}
