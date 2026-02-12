import javax.xml.stream.events.StartDocument;

public class Constructor_overloading {
    public static void main(String[] args) {
        Student s1 = new Student("Hari");
        Student s2 = new Student("Mohan ", 20);
        Student s3 = new Student("Shyam", 21, "Excellent");
        System.out.println("S1 : "+s1.name +"\t"+ s1.age +"\t"+ s1.grade);
        System.out.println("S2 : "+s2.name +"\t"+ s2.age +"\t"+ s2.grade);
        System.out.println("S3 : "+s3.name +"\t"+ s3.age +"\t"+ s3.grade);
    }
}
class Student{
    String name;
    int age;
    String grade;
    Student(String name){
        this.name = name;
        this.age = 0;
        this.grade = "Not assigned ";
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.grade = "Not assigned ";
    }
    Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}