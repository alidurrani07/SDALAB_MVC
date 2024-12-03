package Controller;

import Model.Student;
import Model.Class;
import View.StudentView;

public class StdController {
    private Student student;
    private Class studentClass;
    private StudentView view;

    // Constructor for individual student
    public StdController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    // Constructor for class
    public StdController(Class studentClass, StudentView view) {
        this.studentClass = studentClass;
        this.view = view;
    }

    // Update individual student view
    public void updateView() {
        view.printStudentDetails(student.getName(), student.getRegNo(), student.getGpa(), student.getSemester());
    }

    // Show class details
    public void showClassDetails() {
        if (studentClass == null) {
            throw new UnsupportedOperationException("Class details are not initialized.");
        }
        view.printClassDetails(studentClass.getStudents());
    }

    // Show aggregated details
    public void showAggregatedDetails() {
        if (studentClass == null) {
            throw new UnsupportedOperationException("Class details are not initialized.");
        }
        double maxGPA = studentClass.getMaxGPA();
        double minGPA = studentClass.getMinGPA();
        double avgGPA = studentClass.getAvgGPA();

        view.printAggregatedDetails(maxGPA, minGPA, avgGPA);
    }
}
