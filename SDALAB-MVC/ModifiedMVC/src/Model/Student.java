
package Model;

public class Student {
    private String name;
    private String regNo;
    private double gpa;
    private String semester;

    // Constructor
    public Student(String name, String regNo, double gpa, String semester) {
        this.name = name;
        this.regNo = regNo;
        this.gpa = gpa;
        this.semester = semester;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}

