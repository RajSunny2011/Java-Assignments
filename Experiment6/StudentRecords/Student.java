package Experiment6.StudentRecords;

public class Student {
    final private String name;
    final private int studentId;
    private char grade;
    public Student(String name, int studentId, char grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }
    
    public void setGrade(char grade) {
        this.grade = grade;
    }
}
