//Practice Question 2: Multiple Students in Array
//Use the same Student class from Question 1
//Add ONE new method: getTotalMarks() - returns sum of marks
//In main():
//        •	Create an array of 3 students:
//Student 1: "Bob", 201, [65, 70, 80]
//Student 2: "Carol", 202, [90, 85, 88]
//Student 3: "Dave", 203, [45, 60, 55]
//        •	Loop through array and print each student's:
//Name, Total Marks, Percentage
//•	Find and print the student with highest percentage

public class Day3_5setsQ2 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 201, new int[]{65, 70, 80});
        Student s2 = new Student("Carol", 202, new int[]{90, 85, 88});
        Student s3 = new Student("Dave", 203, new int[]{45, 60, 55});
        // array of students object
        Student [] students = {s1,s2,s3};
        for(Student s : students){
            s.displayInfo();
            System.out.println("Total marks : "+s.getTotalMarks());
            System.out.println("Percentage : "+((s.getTotalMarks())/300.0*100.0));
        }
        // Find and display highest percentage student
        Student highest = getHighestPercentageStudent(students);
        System.out.println("\nStudent with highest percentage:");
        System.out.println("Name: " + highest.getName() +
                ", Percentage: " + highest.calculatePercentage() + "%");
    }

    static Student getHighestPercentageStudent(Student[] arr){
        Student highest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i].calculatePercentage() > highest.calculatePercentage()){
                highest = arr[i];
            }
        }
        return highest;  // Return the object, not index!
    }
}