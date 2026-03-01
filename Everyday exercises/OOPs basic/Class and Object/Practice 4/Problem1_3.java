/*
* Practice Question 2: Working with Multiple Students
// Once comfortable with #1, try this:
class Student3 {
    private String name;
    private int rollNumber;
    private int[] marks;  // 5 subjects

    // TODO:
    // 1. Constructor
    // 2. calculateAverage() method
    // 3. displayInfo() method
}

// In main:
// - Create 3 students in an array
// - Loop through and display each student's average
// - Find and print the student with highest average
*/
import java.util.Arrays;
public class Problem1_3 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("sandesh",10001,new int[]{67,89,90});
        Student3 s2 = new Student3("sandesh1",10002,new int[]{76,98,90});
        Student3 s3 = new Student3("sandesh2",10003,new int[]{69,89,99});
        Student3[] students = {s1,s2,s3};// array of objects
        // Loop through and display each student's average
        for( Student3 s : students){
            double avg = s.calculateAverage();
            System.out.println("Average : "+avg);
        }
        // Find and print the student with highest average
        double highest = 0;
        int index_of_highest_avg = 0;
        for( int i = 0; i<students.length; i++){
            double avg = students[i].calculateAverage();
            if(avg > highest){
                highest = avg;
                index_of_highest_avg = i;
            }
        }
        System.out.println("Student with highest average is : ");
        students[index_of_highest_avg].displayInfo();
        // in case we want to get highest avg and student through method findhighestAvg()
        int highest_avg_student_index = s1.findhighestAvg(students);
        System.out.println("Studnet with highest average found using method :");
        students[highest_avg_student_index].displayInfo();
    }
}
class Student3{
    private String name;
    private int rollNumber;
    private int[] marks = new int[5];// 5 subjects
    Student3(){
        this.name = "null";
        this.rollNumber = 0;
        // as we know array by default values set to 0
    }
    Student3(String name, int rollNumber, int[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public double calculateAverage(){
        //double total = marks.length*100.0;
        double sum = 0;
        for( int i : marks){
            sum += i;
        }
        return sum/marks.length;
    }
    public void displayInfo(){
        double avg = calculateAverage();
        System.out.println("Name : "+name+"\n"
        +"Roll no : "+rollNumber+"\n"+
                "Marks : "+ Arrays.toString(marks)+"\n"+
                "Average : "+avg);
    }
    // method to return the student who got highest average
    public int findhighestAvg(Student3[] arrayofobj){// here we can also done either by returning object too instead returning index
    // public Student3 findhighestAvg(Student3[] arrayofobj), maybe this one will be more efficient !!!
        double highest = 0; // who got the highest average
        int index_of_highest_avg = 0;
        for( int i = 0; i<arrayofobj.length; i++){
            double avg = arrayofobj[i].calculateAverage();
            if(avg > highest){
                highest = avg;
                index_of_highest_avg = i;
            }
        }
        // Student3 ref = arrayofobj[index_of_highest_avg];
        return index_of_highest_avg;// return ref;
    }
}