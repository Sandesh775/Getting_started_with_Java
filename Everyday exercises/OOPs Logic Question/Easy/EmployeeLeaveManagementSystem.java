/*
* Scenario: Employee Leave Management System
You're building a Leave Management System for a company.
Requirements
Base Class: Employee
Fields: employeeId (String), name (String), availableLeaves (int)
Constructor validates: employeeId not null/empty, availableLeaves cannot be negative
Method: takeLeave(int days) — validates days > 0, days ≤ availableLeaves, then deducts
Method: addLeave(int days) — validates days > 0, adds to availableLeaves
Getters for all fields

Subclass: Manager extends Employee
Adds field: teamSize (int)
Overrides takeLeave(int days) — Managers get 5 extra leave days per year (adds 5 to availableLeaves before deducting)
Constructor chains to super

Subclass: Intern extends Employee
Adds field: mentorName (String)
Overrides takeLeave(int days) — Interns cannot take more than 2 consecutive days (throw exception if days > 2)
Constructor chains to super
* */
public class EmployeeLeaveManagementSystem {
    public static void main(String[] args) {
        // Test Manager
        Managerr mgr = new Managerr("M001", "Alice", 10, 5);
        System.out.println("Manager - Before leave: " + mgr.getAvailableLeaves());
        mgr.takeLeave(3);
        System.out.println("Manager - After 3 days leave: " + mgr.getAvailableLeaves());

        System.out.println();

        // Test Intern
        Internn intern = new Internn("I001", "Bob", 5, "Dr. Smith");
        System.out.println("Intern - Before leave: " + intern.getAvailableLeaves());
        intern.takeLeave(2);
        System.out.println("Intern - After 2 days leave: " + intern.getAvailableLeaves());

        System.out.println();

        // Test Intern taking too many days (should throw exception)
        try {
            intern.takeLeave(3);
        } catch(IllegalArgumentException e) {
            System.out.println("Intern error (correct): " + e.getMessage());
        }
    }
}
class Employeee{
    private String employeeId;
    private String name;
    private int availableLeaves;

    public Employeee(String employeeId, String name, int availableLeaves) {
        if(employeeId==null || employeeId.isEmpty()){
            throw new IllegalArgumentException("employeeId can't be null/empty");
        }
        if(availableLeaves<0){
            throw new IllegalArgumentException("available leave days can't be negative !");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.availableLeaves = availableLeaves;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAvailableLeaves() {
        return availableLeaves;
    }

    protected void setAvailableLeaves(int availableLeaves) {
        this.availableLeaves = availableLeaves;
    }

    public void takeLeave(int days){
        if(days<=0 || days>getAvailableLeaves()){
            throw new IllegalArgumentException("Days can't be negative or exceed total available days !");
        }
        setAvailableLeaves(getAvailableLeaves()-days);
    }

    public void addLeave(int days){
        if(days<=0){
            throw new IllegalArgumentException("Days can't be negative or zero !");
        }
        setAvailableLeaves(getAvailableLeaves()+days);
    }

}
class Managerr extends Employeee{
    private int teamSize;
    private boolean annualBonusApplied = false;  // Track if extra days already given
    public Managerr(String employeeId, String name, int availableLeaves, int teamSize) {
        super(employeeId, name, availableLeaves);
        this.teamSize = teamSize;
    }

    @Override
    public void takeLeave(int days) {
        // Apply 5 extra days ONCE per year (simplified: first leave of the year)
        if(!annualBonusApplied) {
            addLeave(5);  // Use parent's addLeave method
            annualBonusApplied = true;
            System.out.println("  (Applied annual 5-day manager bonus)");
        }
        super.takeLeave(days);  // Now use parent's validation and deduction
    }
}
class Internn extends Employeee{
    private String mentorName;

    public Internn(String employeeId, String name, int availableLeaves, String mentorName) {
        super(employeeId, name, availableLeaves);
        this.mentorName = mentorName;
    }

    @Override
    public void takeLeave(int days) {
        if(days <= 0) {
            throw new IllegalArgumentException("Days must be positive");
        }
        if(days > 2) {
            throw new IllegalArgumentException("Interns cannot take more than 2 consecutive days. Requested: " + days);
        }
        // Let parent handle the rest (validation + deduction)
        super.takeLeave(days);
    }
}