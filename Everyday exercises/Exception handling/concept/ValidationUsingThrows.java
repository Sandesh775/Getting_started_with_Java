//Method validateMarks(int marks) throws IllegalArgumentException
//
//Method calculateGrade() throws IllegalArgumentException (calls validateMarks)
//
//Main method catches the exception
public class ValidationUsingThrows {
    public static void main(String[] args) {
        int marks = 55;
        try {
            calculateGrade(marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static void validateMarks(int marks) throws IllegalArgumentException{
        if(marks<0 || marks>100){
            throw new IllegalArgumentException("Marks must be in range (1-100)");
        }
        System.out.println("Marks validation successful !");
    }
    public static void calculateGrade(int marks) throws IllegalArgumentException{
        validateMarks(marks);
    }
}