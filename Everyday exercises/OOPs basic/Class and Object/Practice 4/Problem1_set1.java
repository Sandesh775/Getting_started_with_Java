/*
* Question 1: Student Grade Management System
Create a Student class with:
•	Private variables: name, rollNumber, marks (array of 3 subjects)
•	Constructor to initialize all properties
•	Copy constructor to create a duplicate student record
•	Getter for name (READ-ONLY, no setter)
•	Setter for marks with validation (0-100)
•	Method calculatePercentage() that uses object's own data
•	Method displayInfo() to show student details
Create two students:
1.	Original student: "John", roll: 101, marks: [85, 90, 78]
2.	Copy of John (using copy constructor) but with different name "John Clone"
*/
public class Problem1_set1 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Danish",1,new double[]{67,79,99.0});
        //double per = s1.calculatePercentage();
        s1.displayInfo();
        //System.out.println(+per);

    }
}
class Student2{
    private String name;
    private  int rollNumber;
    private double[] marks = new double[3];
    Student2(String name, int rollNumber, double[] marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    Student2(Student2 obj){
        this.name = obj.name;
        this.rollNumber = obj.rollNumber;
        this.marks = obj.marks;
    }
    public String getName(){
        return name;
    }

    public String getMarks() {
            return "Marks 1: "+marks[0]+" Marks 2: "+this.marks[1]+" Marks 3: "+marks[2];
    }

    public void setMarks(double m1, double m2, double m3){
        if(m1 > 0 && m1 < 100){
            this.marks[0] = m1;
        }
        else{
            System.out.println("Invalid input");
        }
        if(m2 > 0 && m2 < 100){
            this.marks[1] = m2;
        }
        else{
            System.out.println("Invalid input");
        }
        if(m3 > 0 && m3 < 100){
            this.marks[2] = m3;
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public double calculatePercentage(){
        double sum = 0;
        for( double d : marks){
            sum += d;
        }
        return sum/300.0*100.0;
    }
    public void displayInfo(){
        double per = this.calculatePercentage();
        System.out.println("Name : "+this.name+"\n"+
                "Roll no : "+this.rollNumber+"\n"+
                "Marks : "+this.getMarks()+"\n"+
                "Percentage : "+per);
    }
}