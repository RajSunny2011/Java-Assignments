public class question2Employee {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345, 50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println("Employee Salary after increase: " + emp.getSalary());

        Manager mgr = new Manager("Jane Smith", 67890, 75000, "HR");
        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Salary: " + mgr.getSalary());
        System.out.println("Manager Department: " + mgr.getDepartment());
        mgr.increaseSalary(15);
        System.out.println("Manager Salary after increase: " + mgr.getSalary());
    }
}

class Employee {
    private String name;
    public int empid;
    private double salary;

    public Employee() {
        this.name = "";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * percentage / 100;
        }
    }
}

class Manager extends Employee {
    private final String department;
    public Manager() {
        super();
        this.department = "";
    }
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}