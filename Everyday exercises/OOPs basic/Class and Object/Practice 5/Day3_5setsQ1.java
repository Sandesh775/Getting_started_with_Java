//Practice Question 1: Basic Student - Single Student
//Create a Student class with:
//        •	Private attributes: name (String), rollNumber (int), marks (int array of 3 subjects)
//•	Constructor to initialize all three
//•	Method: calculatePercentage() - returns double (sum/3)
//•	Method: displayInfo() - prints name, roll number, and all marks
//In main():
//        •	Create one student: "Alice", roll: 101, marks: [78, 85, 92]
//        •	Call displayInfo()
//•	Call calculatePercentage() and print the result
import java.util.Arrays;
public class Day3_5setsQ1 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice",101,new int[]{78,85,92});
        s1.displayInfo();
        System.out.println("Result : "+s1.calculatePercentage());
    }
}