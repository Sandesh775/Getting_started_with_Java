//Practice Question 3: Adding Grade Logic
//Enhance the Student class with:
//        •	Method: calculateGrade() - returns char based on percentage:
//A: >= 85, B: >= 70, C: >= 50, D: >= 35, F: below 35
//        •	Method: isPassing() - returns boolean (percentage >= 35)
//In main():
//        •	Create 4 students with different marks
//•	Store in array
//•	Print a report showing:
//Name | Percentage | Grade | Status (Pass/Fail)
//•	Count and print how many students passed

public class Day3_5setsQ3 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 201, new int[]{65, 70, 80});
        Student s2 = new Student("Carol", 202, new int[]{90, 85, 88});
        Student s3 = new Student("Dave", 203, new int[]{45, 60, 55});
        Student s4 = new Student("Alice",101,new int[]{78,85,92});
        Student[] students = {s1,s2,s3,s4};
        for( Student s : students){
            double percentage = s.calculatePercentage();
            char grade = s.calculateGrade();
            String status = s.isPassing() ? "Pass" : "Fail";
            System.out.println("Name: " + s.getName() +
                    " | Percentage: " + percentage +
                    " | Grade: " + grade +
                    " | Status: " + status);
        }
    }
}