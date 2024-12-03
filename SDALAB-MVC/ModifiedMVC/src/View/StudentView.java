package View;

import Model.Student;
import java.util.List;

public class StudentView {
    // Print individual student details
    public void printStudentDetails(String name, String regNo, double gpa, String semester) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Registration No: " + regNo);
        System.out.println("GPA: " + gpa);
        System.out.println("Semester: " + semester);
        System.out.println();
    }

    // Print class details
    public void printClassDetails(List<Student> students) {
        System.out.println("Class Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Registration No: " + student.getRegNo() +
                    ", GPA: " + student.getGpa() + ", Semester: " + student.getSemester());
        }
        System.out.println();
    }

    // Print aggregated GPA details
    public void printAggregatedDetails(double maxGPA, double minGPA, double avgGPA) {
        System.out.println("Aggregated Details:");
        System.out.println("Maximum GPA: " + maxGPA);
        System.out.println("Minimum GPA: " + minGPA);
        System.out.println("Overall Average GPA: " + avgGPA);
        System.out.println();
    }
}
