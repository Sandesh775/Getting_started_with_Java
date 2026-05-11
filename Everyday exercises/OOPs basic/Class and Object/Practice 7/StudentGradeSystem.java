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
public class StudentGradeSystem {
    public static void main(String[] args) {
        // Creating array of 5 students
        Student[] students = new Student[5];

        // Student 1
        int[] marks1 = {85, 90, 78, 88, 92};
        students[0] = new Student("Ram", 101, marks1);

        // Student 2
        int[] marks2 = {75, 80, 82, 79, 85};
        students[1] = new Student("Hari", 102, marks2);

        // Student 3
        int[] marks3 = {95, 92, 88, 91, 89};
        students[2] = new Student("Sita", 103, marks3);

        // Student 4
        int[] marks4 = {65, 70, 68, 72, 69};
        students[3] = new Student("Gita", 104, marks4);

        // Student 5
        int[] marks5 = {88, 84, 86, 90, 87};
        students[4] = new Student("Shyam", 105, marks5);

        Student highestAvgStudent = students[0];// assuming that this student object has highest average
        double highestAvg = highestAvgStudent.calculateAverage();
        for(int i = 1; i<students.length; i++){
            double currentAvg = students[i].calculateAverage();
            if(currentAvg>highestAvg){
                highestAvgStudent = students[i];// update Student object
                highestAvg = currentAvg;// update highest average variable
            }
        }
        System.out.println("Student with highest average is : ");
        highestAvgStudent.displayReport();

        // counting students with grade 'A'
        System.out.println("Student with grade 'A': ");
        int count = 0;
        for(Student s : students){
            char g = s.findGrade();
            if(g == 'A'){
                s.displayReport();
                count++;
            }
        }
        System.out.println("Total students with grade 'A' : "+count);
//        Approach 2: Store references if you need them later
//        Student[] gradeAStudents = new Student[students.length];
//        int index = 0;
//
//        for (Student s : students) {
//            if (s.calculateGrade() == 'A') {
//                gradeAStudents[index] = s;
//                index++;
//            }
//        }
        //Display all students sorted by average (descending)
        //Solution: Sort the Student array directly, not the averages.
        //Compare students by their averages inside the sort:
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].calculateAverage() > students[i].calculateAverage()) {
                    // Swap the actual Student objects
                    Student temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
        System.out.println("All students sorted by average (descending order) : ");
        for(Student s : students){
            s.displayReport();
        }
        // in case we need to Store references but want to keep original and descending separately
        // solution : Make a copy, sort the copy, original stays untouched.
        //       Student[] sortedStudents = students.clone();  // Make copy
// Sort the copy
//        for (int i = 0; i < sortedStudents.length - 1; i++) {
//            for (int j = i + 1; j < sortedStudents.length; j++) {
//                if (sortedStudents[j].calculateAverage() > sortedStudents[i].calculateAverage()) {
//                    Student temp = sortedStudents[j];
//                    sortedStudents[j] = sortedStudents[i];
//                    sortedStudents[i] = temp;
//                }
//            }
//        }
    }
}
class Student{
    // fields
    private String name;
    private int rollNumber;
    private int[] marks = new int[5];
    // constructor
    Student(String name, int rollNumber, int[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public double calculateAverage(){
        double n = marks.length;
        double total = 0;
        for( int i : marks){
            total += i;
        }
        return total/n;
    }
    public char findGrade() {
        double n = marks.length;
        double total = 0;
        for (int i : marks) {
            total += i;
        }
        double percentage = (total / (n * 100)) * 100;  // (total / n);

        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
    public void displayReport(){
        System.out.println("Name : "+name+"\n"+
                "Roll no : "+rollNumber+"\n"+
                "Marks : "+ Arrays.toString(marks)+"\n"+
                "Average : "+calculateAverage()+"\n"+
                "Grade : "+findGrade());
    }
}