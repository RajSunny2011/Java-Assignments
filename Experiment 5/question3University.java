class Person {
    String name;
    int age;
    String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Staff extends Person {
    String staffId;
    String department;
    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

class Professor extends Staff {
    String specialization;
    public Professor(String name, int age, String address, String staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }
}

class Student extends Person {
    String studentId;
    String course;
    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

class GraduateStudent extends Student {
    String researchTopic;
    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
    public void submitThesis() {
        System.out.println(name + " has submitted a thesis on " + researchTopic);
    }
}

public class question3University {
    public static void main(String[] args) {
        Professor aProfessor = new Professor("Sumit", 45, "123", "P123", "Computer Science", "Artificial Intelligence");
        GraduateStudent aStudent = new GraduateStudent("Abhishek", 28, "456", "S456", "Biology", "Genetic Engineering");
        aProfessor.conductLecture();
        aProfessor.displayInfo();
        aStudent.submitThesis();
        aStudent.displayInfo();
    }
}