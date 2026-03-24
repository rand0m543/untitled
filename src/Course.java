// Course.java
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
}