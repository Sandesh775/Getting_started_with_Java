//________________________________________
//Practice Question 4: Working with Marks Array Operations
//Add these methods to Student class:
//        •	getHighestMark() - returns the highest mark among subjects
//•	getLowestMark() - returns the lowest mark among subjects
//•	isAllSubjectsPassing() - returns true if ALL subjects >= 35
//In main():
//        •	Create 3 students with 5 subjects each
//•	For each student, display:
//Name, Highest Mark, Lowest Mark, Average, Grade
//•	Also display "Honors" if all subjects >= 75
//        •	Find student with highest lowest-mark (most consistent performer)
public class Day3_5setsQ4 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 201, new int[]{65, 70, 80});
        Student s2 = new Student("Carol", 202, new int[]{14, 85, 88});
        Student s3 = new Student("Dave", 203, new int[]{45, 60, 55});
        Student students [] = {s1,s2,s3};
        System.out.println("=== STUDENT REPORT ===\n");
        // Display each student's details
        for(Student s : students) {
            String name = s.getName();
            int highMark = s.getHighestMark();
            int lowMark = s.getLowestMark();
            double avg = s.calculateAverage();
            char grade = s.calculateGrade();
            boolean allPassing = s.isAllSubjectsPassing();

            System.out.println("  Name: " + name);
            System.out.println("  Highest Mark: " + highMark);
            System.out.println("  Lowest Mark: " + lowMark);
            System.out.println("  Average: " + avg);
            System.out.println("  Grade: " + grade);

            //Display "Honors" if all subjects >= 75
            if (allPassing && lowMark >= 75) {  // All subjects >= 75 means lowest >= 75
                System.out.println("  🏆 HONORS STUDENT! (All subjects ≥ 75)");
            }
            System.out.println(" ");
        }
        System.out.println("=== MOST CONSISTENT PERFORMER ===\n");
        Student mostConsistent = findMostConsistentStudent(students);
        System.out.println("Most consistent student: " + mostConsistent.getName());
        System.out.println("lowest mark was: " + mostConsistent.getLowestMark());
    }
    // Helper method to find student with highest lowest-mark
    public static Student findMostConsistentStudent(Student[] students) {
        if(students.length == 0) return null;

        Student consistent = students[0];
        int highestLowMark = students[0].getLowestMark();

        for(int i = 1; i < students.length; i++) {
            int currentLowMark = students[i].getLowestMark();
            if(currentLowMark > highestLowMark) {
                highestLowMark = currentLowMark;
                consistent = students[i];
            }
        }
        return consistent;
    }
}