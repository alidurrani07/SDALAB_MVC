import Model.Student;
import Model.Class;
import View.StudentView;
import Controller.StdController;

public class Main {
    public static void main(String[] args) {
        // Individual student details
        Student student1 = new Student("Abdul Rahman Ali", "FA22-BSE-088", 3.00, "6TH");
        StudentView view = new StudentView();
        StdController singleController = new StdController(student1, view);
        singleController.updateView(); // Display individual student details

        // Class details
        Class studentClass = new Class();
        studentClass.addStudent(new Student("Tayyab", "FA22-BSE-098", 3.00, "6TH"));
        studentClass.addStudent(new Student("Usman", "FA22-BSE-058", 2.7, "6TH"));
        studentClass.addStudent(new Student("Rehman Ghani", "FA22-BSE-099", 3.67, "6TH"));
        studentClass.addStudent(new Student("Mansoor", "FA22-BSE-059", 2.50, "6TH"));
        studentClass.addStudent(new Student("Tanveer", "FA22-BSE-060", 2.00, "6TH"));
        studentClass.addStudent(new Student("Kashif Khan", "FA22-BSE-068", 3.60, "6TH"));
        studentClass.addStudent(new Student("Umer Liaquat", "FA22-BSE-053", 2.70, "6TH"));
        studentClass.addStudent(new Student("Huzaifa", "FA22-BSE-079", 2.70, "6TH"));
        studentClass.addStudent(new Student("Shahzaib Khan", "FA22-BSE-100", 2.0, "6TH"));

        // Controller for class
        StdController classController = new StdController(studentClass, view);
        
        // Display the details of the class
        classController.showClassDetails();
        
        // Display the aggregated GPA details
        classController.showAggregatedDetails();
    }
}

