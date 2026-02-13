/*Problem 3: Employee Hierarchy (Single-Level Inheritance) 👨‍💼
Topics: Single-level Inheritance, Constructor in Parent-Child
Task: Create:

Parent class Employee with: name, salary, constructor, method displayEmployee()
Child class Manager extends Employee, adds: department, constructor using super(), method displayManager()

Create a Manager object and display both employee and manager info.
Expected Output:
Employee: John Doe
Salary: $50000.0
Department: IT
*/
public class Problem03 {
    public static void main(String[] args) {
        Manager m1 = new Manager("John Doe", 50000.0, "IT");
        m1.displayManager();
    }
}
class Employee{
    String name;
    double salary;
    // default
    public Employee(){
        this.name = "null";
        this.salary = 0.0;
    }
    // parameterized

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void displayEmployee(){
        System.out.println("Employee name : "+this.name+"\nSalary : "+this.salary);
    }
}
class Manager extends Employee{
    String department;
    public Manager(String name, double salary, String department){
        super(name,salary);// call superclass / parent class constructor
        this.department = department;
    }
    public void displayManager(){
//        this.displayEmployee();
//        System.out.println("Department : "+this.department);
        System.out.println("Employee name : "+this.name+"\nSalary : "+this.salary+"\nDepartment :"+this.department);
    }
}