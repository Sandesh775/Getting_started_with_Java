public class Constructor{
    public static void main(String [] args){
        Student s1 = new Student();// passing no parameter
        Student s2 = new Student(1001,"Ram");// passing parameter while creating object
        System.out.println("Displaying the info of student s1 : ");
        s1.displayInfo();
        System.out.println("Displaying the info of student s2 : ");
        s2.displayInfo();
    }
}
class Student{
    int rollno;
    String name;
    public Student(){// default constructor, even if i don't create it, it will automatically
                    // created by program, where int value is set to 0, and String is null 
    }
    public Student(int roll, String studentname){// parameterized constructor
        rollno = roll;
        name = studentname;
    }
    public void displayInfo(){
        System.out.println("Roll no : "+rollno+" Name : "+name);
    }
}