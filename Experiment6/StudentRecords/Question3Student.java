package Experiment6.StudentRecords;

public class Question3Student {
    public static void main(String[] args) {
        Student student1 = new Student("Student1", 12345, 'A');
        Student student2 = new Student("Student2", 54321, 'B');
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student1.setGrade('B');
        student2.setGrade('A');
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
