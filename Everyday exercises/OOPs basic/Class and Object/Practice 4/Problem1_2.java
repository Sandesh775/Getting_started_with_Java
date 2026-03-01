import java.util.Arrays;

/*
* Practice Question 1: Basic Student Class
// Try this first - just the basics
class Student1 {
    private String name;
    private int rollNumber;
    private int[] marks;  // 3 subjects

    // TODO:
    // 1. Create constructor
    // 2. Create a method to calculate percentage
    // 3. Create a method to display info

    // Start with just these 3 methods first!
}

// In main:
// - Create 1 student
// - Display their info and percentage
*/
public class Problem1_2 {
    public static void main(String[] args) {
        // important thing is we are passing marks of 3 subject in array so we can do in two
        // ways : One either firstly create marks array and passed reference variable and second is here
        Student1 s1 = new Student1("Sandesh",10001, new int[]{99,80,77});
        s1.displayinfo();
        /*Second approach :
        int[] marks_ref = {99, 80, 77};
        Student1 s1 = new Student1("Sandesh",10001,marks_ref);
        * */
    }
}
class Student1{
    private String name;
    private int rollNumber;
    private int[] marks = new int[3];// 3 subjects!
    Student1(){
        this.name = "null";
        this.rollNumber = 0;
        // default value of integer array is set to 0
    }
    Student1(String name, int rollNumber, int[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public double calculatepercentage(){
        double sum = 0;
        for( int i = 0; i<marks.length; i++){
            sum += marks[i];
        }
        return sum/300.0*100.0;
    }
    /*
    * public double calculatepercentage() {
    double sum = 0;
    int totalMarks = marks.length * 100;  // Calculate based on array length
    for(int mark : marks) {  // Enhanced for loop
        sum += mark;
    }
    return (sum / totalMarks) * 100;
}*/
    public void displayinfo(){
        double percentage = calculatepercentage();// to get percentage info
        System.out.println("Name: "+name+"\n"+
                "Roll no: "+rollNumber+"\n"+
                "Marks : "+ Arrays.toString(marks)+"\n"+
                "Percentage : "+percentage);
    }
}