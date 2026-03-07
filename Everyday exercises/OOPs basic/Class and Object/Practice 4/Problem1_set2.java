import java.util.Arrays;

/*
* Problem 1: Student Grade System (OOP + Arrays + Logic)..another set
Create a Student class with:
- name, rollNumber, marks[] (5 subjects)
- Constructor with all fields
- Method: calculateAverage()
- Method: findGrade() (A: >90, B: >80, etc.)
- Method: displayReport()

In main:
- Create array of 5 students
- Find student with highest average
- Count how many students got grade 'A'
- Display all students sorted by average (descending)
*/
public class Problem1_set2{
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 1, new double[]{91.0, 72, 63, 44, 55});// Create a new object and pass an anonymous array
        Student s2 = new Student("Ram1", 10, new double[]{92.0, 72, 63, 4, 15});
        Student s3 = new Student("Ram2", 100, new double[]{91.0, 72, 89, 44, 55});
        Student s4 = new Student("Ram3", 1000, new double[]{67, 72, 6, 44, 5});
        Student s5 = new Student("Ram4", 10000, new double[]{91.0, 72, 69, 44, 90});
        // array of Students
        Student[] students = {s1, s2, s3, s4, s5};
        double highest_avg = students[0].calculateAverage();
        int index = 0;
        for (int i = 1; i < students.length; i++) {
            double avg = students[i].calculateAverage();
            if (highest_avg < avg) {
                highest_avg = avg;
                index = i;
            }
        }
        System.out.println("Student with highest average : " + highest_avg);
        students[index].displayReport();
        int count = 0;
        for( int i = 0; i<students.length; i++){
            char grade = students[i].findGrade();
            if(grade == 'A'){
                count++;
            }
        }
        System.out.println(count + " students got grade 'A'");
        // Sort students by average (descending)
        for(int i = 0; i < students.length - 1; i++){
            for(int j = i + 1; j < students.length; j++){
                // Compare averages
                if(students[i].calculateAverage() < students[j].calculateAverage()){
                    // Swap STUDENT OBJECTS, not just averages
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

// NOW print after sorting is complete
        System.out.println("\nStudents sorted by average (descending):");
        for(int i = 0; i < students.length; i++){
            System.out.println((i+1) + ". " + students[i].getName() +
                    " - Average: " + students[i].calculateAverage());
        }
    }
}
class Student{
    private String name;
    private int rollNumber;
    private double[] marks = new double[5];
    Student(String name, int rollNumber, double[]marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public double calculateAverage(){
        double total , sum = 0;
        for( double d : marks){
            sum += d;
        }
        total = marks.length;
        return sum/total;
    }
    public char findGrade(){
        double avg = this.calculateAverage();
        if(avg >= 90){
            return 'A';
        }
        else if (avg >= 80) {
            return 'B';
        }
        else if (avg >= 70) {
            return 'C';
        }
        else if (avg >= 60) {
            return 'D';
        }
        else if (avg >= 50) {
            return 'E';
        }
        else{
            return 'N';
        }
    }
    public void displayReport(){
        System.out.println("Name : "+name+"\n"+
                "Roll no : "+rollNumber+"\n"+
                "Marks : "+ Arrays.toString(marks)+"\n"+
                "Average : "+calculateAverage());
    }
    public void displayAverage(){
        System.out.println(this.calculateAverage());
    }
}
//import java.util.*;
//public class Problem1_set2 {
//    public static void main(String[] args) {
//        Student s1 = new Student("Ram", 1, new double[]{91.0, 72, 63, 44, 55});// Create a new object and pass an anonymous array
//        Student s2 = new Student("Ram1", 10, new double[]{92.0, 72, 63, 4, 15});
//        Student s3 = new Student("Ram2", 100, new double[]{91.0, 72, 89, 44, 55});
//        Student s4 = new Student("Ram3", 1000, new double[]{67, 72, 6, 44, 5});
//        Student s5 = new Student("Ram4", 10000, new double[]{91.0, 72, 69, 44, 90});
//        // array of Students
//        Student[] students = {s1, s2, s3, s4, s5};
//        double highest_avg = 0;
//        int index = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (highest_avg < students[i].avg) {
//                highest_avg = students[i].avg;
//                index = i;
//            }
//        }
//        System.out.println("Student with highest average : " + students[index].avg);
//        students[index].displayReport();
//        int count = 0;
//        for (Student s : students) {
//            if (s.grade == "A") {
//                count++;
//            }
//        }
//        System.out.println(count + " students got grade 'A'");
//
//        System.out.println("Display all students sorted by average (descending)");
//        for( int i = 0; i <students.length - 1; i++){
//            for( int j = i+1; j<students.length; j++){
//                if(students[i].avg < students[j].avg){
//                    double temp = students[j].avg;
//                    students[j].avg = students[i].avg;
//                    students[i].avg = temp;
//                }
//            }
//            students[i].displayReport();
//        }
//    }
//}
//class Student{
//    String name;
//    int rollNumber;
//    double[] marks = new double[5];
//    double avg;
//    String grade;
//    Scanner sc = new Scanner(System.in);
//    public Student(String name, int rollNumber, double[] marks) {
//        this.name = name;
//        this.rollNumber = rollNumber;
//        this.marks = marks;
//        this.avg = this.calculateAverage(this.marks);
//        this.grade = this.findGrade(this.marks);
//    }
//
//    public void displayReport(){
//        System.out.println("Name : "+this.name+"\tRoll no : "+this.rollNumber);
//        for(double d : marks){
//            System.out.println("Sub : "+d);
//        }
//        System.out.println("Average : "+this.calculateAverage(marks)+"\tGrade Obtained : "+this.findGrade(marks));
//    }
//    public double calculateAverage(double[] a){
//        double avg;
//        double sum = 0;
//        for(double d : a){
//            sum += d;
//        }
//        avg = sum/5;
//        return avg;
//    }
//    public String findGrade(double[] a){
//        double sum = 0;
//        double avg ;
//        for(double d : a){
//            sum += d;
//        }
//        avg = sum/5.0;
//        if(avg >= 90){
//            return "A+";
//        } else if (avg >= 85) {
//            return "A";
//        }
//        else if (avg >= 80) {
//            return "A-";
//        }
//        else if (avg >= 75) {
//            return "B+";
//        }
//        else if (avg >= 70) {
//            return "B";
//        }
//        else if (avg >= 65) {
//            return "B-";
//        }
//        else if (avg >= 60) {
//            return "C+";
//        }
//        else if (avg >= 55) {
//            return "C";
//        }
//        else if (avg >= 50) {
//            return "C-";
//        }
//        else{
//            return "NG";
//        }
//    }
//    public void displayAverage(){
//        System.out.println(this.avg);
//    }
//}