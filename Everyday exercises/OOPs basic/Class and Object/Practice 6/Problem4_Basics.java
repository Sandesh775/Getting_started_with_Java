//Problem 4: Create a Student class and a Course class
//•	Student has name, enrolledCourse (Course object)
//•	Course has courseName, fees
//•	Pattern to learn: Objects containing other objects

public class Problem4_Basics {
    public static void main(String[] args) {
        Student s1 = new Student("Sandesh", new Course("BCA",340000));
    }
}
class Student{
    String name;
    Course enrolledCourse; //= new Course();
    Student(String name, Course obj){
        this.name = name;
        this.enrolledCourse = obj;
    }
}
class Course{
    String courseName;
    double fees;
    Course(String courseName, double fees){
        this.courseName = courseName;
        this.fees = fees;
    }
}