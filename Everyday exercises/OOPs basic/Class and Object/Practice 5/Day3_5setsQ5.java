//Practice Question 5: Simple Sorting without Arrays.sort()
//Use Student class from previous questions
//        In main():
//        •	Create 5 students with random marks
//•	Store in array
//•	Find and display top 3 students by percentage WITHOUT using sort
//HINT: Find highest, remove/ignore it, find next highest...
//BONUS: Count how many students got each grade (A, B, C, D, F)
public class Day3_5setsQ5 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 201, new int[]{65, 70, 80});
        Student s2 = new Student("Carol", 202, new int[]{90, 85, 88});
        Student s3 = new Student("Dave", 203, new int[]{45, 60, 55});
        Student s4 = new Student("Alice",101,new int[]{78,85,92});
        Student s5 = new Student("Yadav",111,new int[]{90,85,99});

        Student[] students = {s1,s2,s3,s4,s5};

    }
}