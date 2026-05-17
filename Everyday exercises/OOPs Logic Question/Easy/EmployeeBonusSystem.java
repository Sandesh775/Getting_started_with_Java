/*
* Problem 3: Employee Bonus System
Create:

Abstract class Employee with fields name, salary

Abstract method double calculateBonus()

Classes Manager (bonus = salary * 0.2) and Developer (bonus = salary * 0.1)

In main(), create array of Employees

Loop and print each employee's bonus

Question after you code: If a new Intern class (bonus = fixed 500) joins, do you modify Employee?
* */
public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Manager e1 = new Manager("Sandesh",2000000);
        Developer e2 = new Developer("Hari",50000);
        Employee [] employees = {e1,e2};

        for(Employee e : employees){
            System.out.println(e.name+" bonus : "+e.calculateBonus());
        }
        Intern e3 = new Intern("Ram",10000);
        System.out.println(e3.name+" bonus : "+e3.calculateBonus());
    }
}
abstract class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}
class Manager extends Employee{

    public Manager(String name,double salary) {
        super(name,salary);
    }
    @Override
    public double calculateBonus(){
        return salary * 0.2;
    }
}
class Developer extends Employee{

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus(){
        return salary * 0.1;
    }
}
class Intern extends Employee{
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return 500;
    }
}
// Not at all , why do i have to , when Intern class will handle it's own implementation of calculateBonus() method !