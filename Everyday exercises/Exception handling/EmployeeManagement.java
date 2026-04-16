// Create custom exceptions:
// - InvalidSalaryException (salary < 0 or > 1000000)
// - InvalidAgeException (age < 18 or > 60)
// - EmployeeNotFoundException (emp ID not found)
//
// Methods: validateSalary(), validateAge(), findEmployee()
// Main: Test with invalid data
// Multiple independent methods (need separate try-catch)
/*
* eg :-
* // ❌ Wrong - if findEmployee fails, others never run
try {
    findEmployee("Tanka");     // Exception here
    validateAge(2);            // ❌ Never runs
    validateSalary(300000);    // ❌ Never runs
} catch (Exception e) { }

// ✅ Correct - each runs independently
try { findEmployee("Tanka"); } catch (Exception e) { }
try { validateAge(2); } catch (Exception e) { }
try { validateSalary(300000); } catch (Exception e) { }
* */
public class EmployeeManagement {
    public static void main(String[] args) {
//        try{
//            findEmployee("Ram");
//            validateAge(21);
//            validateSalary(30000);
//        }catch (InvalidSalaryException e){
//            System.out.println("Error : "+e.getMessage());
//        }catch (InvalidAgeException e){
//            System.out.println("Error : "+e.getMessage());
//        }catch (EmployeeNotFoundException e){
//            System.out.println("Error : "+e.getMessage());
//        }
        // Test 1: Employee Not Found
        System.out.println("=== Test 1: Employee Not Found ===");
        try {
            findEmployee("Tanka");
        } catch (EmployeeNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Invalid Age
        System.out.println("\n=== Test 2: Invalid Age ===");
        try {
            validateAge(2);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3: Invalid Salary
        System.out.println("\n=== Test 3: Invalid Salary ===");
        try {
            validateSalary(2000000);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 4: All Valid
        System.out.println("\n=== Test 4: All Valid ===");
        try {
            findEmployee("Ram");
            validateAge(25);
            validateSalary(300000);
        } catch (InvalidSalaryException | InvalidAgeException | EmployeeNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void validateSalary(int salary)throws InvalidSalaryException{
        if(salary<0 || salary>1000000){
            throw new InvalidSalaryException("Invalid salary : "+salary);
        }
        System.out.println("Employee salary : "+salary);
    }
    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 18 || age > 60){
            throw new InvalidAgeException("Age must me within range : age < 18 or > 60");
        }
        System.out.println("Employee age : "+age);
    }
    public static void findEmployee(String employee) throws EmployeeNotFoundException{
        String[] employeeNames = {"Hari","Krishna","Ram","Gopal","John","Mark"};
        boolean isFound = false;
        for (String s : employeeNames){
            if(s.equalsIgnoreCase(employee)){
                isFound = true;
            }
        }
        if(!isFound){
            throw new EmployeeNotFoundException("Employee Not found in record ");
        }
        System.out.println("Employee found Name : "+employee);
    }
}
class InvalidSalaryException extends Exception{
    InvalidSalaryException(String message){
        super(message);
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class EmployeeNotFoundException extends Exception{
    EmployeeNotFoundException(String message){
        super(message);
    }
}