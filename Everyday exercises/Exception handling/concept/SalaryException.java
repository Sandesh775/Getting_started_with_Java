public class SalaryException {
    int salary;
    SalaryException(int salary){
        setSalary(salary);
    }
    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }
}