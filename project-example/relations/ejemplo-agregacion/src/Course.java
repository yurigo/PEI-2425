import java.util.ArrayList;
import java.util.Date;

public class Course {
    private int year;
    private ArrayList<Subject> subjects;

    public Course() {
        this.subjects = new ArrayList<Subject>();
    }

    public Course(int year) {
        this.year = year;
        this.subjects = new ArrayList<Subject>();
    }

    public Course(Date date) {
        this.year = date.getYear();
        this.subjects = new ArrayList<Subject>();
    }

    public void setYear(int year){
        this.year = year;
    }

}
