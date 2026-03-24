// Course.java
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
    
    //fuck this

    public void addStudent(Student student) {
        students.add(student);
    }

    
    public void displayStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            s.displayInfo();
        }
    }
}