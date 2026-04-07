import java.util.Arrays;
public class Student{
    private String name;
    private int rollNumber;
    private int[] marks = new int[3];
    Student(String name, int rollNumber, int[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName(){
        return name;
    }
    public double calculateAverage(){
        int sum = 0;
        for( int i : marks){
            sum += i;
        }
        return sum/3.0;
    }
    public double calculatePercentage(){
        int sum = 0;
        for( int i : marks){
            sum += i;
        }
        return sum/3.0;// double percentage = (total / (n * maxMarksPerSubject)) * 100;
    }
    public void displayInfo(){
        System.out.println("Name : "+this.name+" Roll no : "+this.rollNumber+" Marks : "+ Arrays.toString(marks));
    }
    public int getTotalMarks(){
        int sum = 0;
        for( int i : marks){
            sum += i;
        }
        return sum;
    }
    public char calculateGrade(){
        //A: >= 85, B: >= 70, C: >= 50, D: >= 35, F: below 35
        double percent = this.calculatePercentage();
        if(percent >= 85){
            return 'A';
        }
        else if(percent >= 70){
            return 'B';
        }
        else if(percent >= 50){
            return 'C';
        }
        else if(percent >= 35){
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public boolean isPassing(){
//        double percent = this.calculatePercentage();
//        if(percent >= 35){
//            return true;
//        }
//        return false;
        return this.calculatePercentage() >= 35;
    }
    public int getHighestMark(){
        int highestMark = 0;
        for(int i : marks){
            if(i > highestMark){
                highestMark = i;
            }
        }
        return highestMark;
    }
    public int getLowestMark(){
        int lowestMark = marks[0];
        for(int i : marks){
            if(i < lowestMark){
                lowestMark = i;
            }
        }
        return lowestMark;
    }
    public boolean isAllSubjectsPassing(){
        for(int i: marks){
            if(i < 35){
                return false;
            }
        }
        return true;
    }
}