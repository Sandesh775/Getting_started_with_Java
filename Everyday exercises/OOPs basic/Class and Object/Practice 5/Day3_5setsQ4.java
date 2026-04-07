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
        for(int i = 0; i<students.length; i++){
           String name =  students[i].getName();
           int highMark = students[i].getHighestMark();
           int lowMark = students[i].getLowestMark();
           double avg = students[i].calculateAverage();
           char grade = students[i].calculateGrade();
            System.out.println("Name : "+name+"\t"+
                    "Highest Mark : "+highMark+"\t"+
                    "Lowest Mark : "+lowMark+"\t"+
                    "Average : "+avg+"\t"+
                    "Grade : "+grade);
        }
        for(Student s : students){
            for(int i = 0;i<s.)
        }
    }
}