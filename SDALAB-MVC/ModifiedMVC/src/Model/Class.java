package Model;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private List<Student> students;

    public Class() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getMaxGPA() {
        double maxGPA = 0.0;
        for (Student student : students) {
            if (student.getGpa() > maxGPA) {
                maxGPA = student.getGpa();
            }
        }
        return maxGPA;
    }

    public double getMinGPA() {
        double minGPA = Double.MAX_VALUE;
        for (Student student : students) {
            if (student.getGpa() < minGPA) {
                minGPA = student.getGpa();
            }
        }
        return minGPA;
    }

    public double getAvgGPA() {
        double totalGPA = 0.0;
        for (Student student : students) {
            totalGPA += student.getGpa();
        }
        return totalGPA / students.size();
    }
}
