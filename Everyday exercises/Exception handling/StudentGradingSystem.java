// Create custom exceptions:
// - InvalidMarksException (marks < 0 or > 100)
// - StudentNotFoundException (student ID not found)
//
// Methods:
// - validateMarks(int marks) throws InvalidMarksException
// - findStudent(int id) throws StudentNotFoundException
//
// Main: Test both exceptions
public class StudentGradingSystem {
    public static void main(String[] args) {
        try {
            validateMarks(30);
            findStudent(101);
        } catch (InvalidMarksException1 e) {
            System.out.println("Error : "+e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static void validateMarks(int marks) throws InvalidMarksException1{
        if(marks<0 || marks>100){
            throw new InvalidMarksException1("Valid marks < 0 or > 100 token entered ! : "+marks);
        }
        System.out.println("Student marks : "+marks);
    }
    public static void findStudent(int id) throws StudentNotFoundException{
        int[] validStudentIds = {101, 102, 103, 104, 105};
        boolean found = false;

        for(int studentId : validStudentIds) {
            if(studentId == id) {
                found = true;
                break;
            }
        }

        if(!found) {
            throw new StudentNotFoundException("Student with ID " + id + " not found!");
        }

        System.out.println("Student found! ID: " + id);
    }
}
class InvalidMarksException1 extends Exception{
    InvalidMarksException1(String message){
        super(message);
    }
}
class StudentNotFoundException extends Exception{
    StudentNotFoundException(String message){
        super(message);
    }
}