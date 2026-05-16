/*
* /**
 * YOUR TASK:
 *
 * 1. Create interface Repository<T> with these methods:
 *    - void add(T item)
 *    - T getById(int id)
 *    - List<T> getAll()
 *    - void delete(int id)
 *
 * 2. Create class Student:
 *    - int id
 *    - String name
 *    - double grade
 *    - constructor, getters, toString()
 *
 * 3. Create class Book:
 *    - int id
 *    - String title
 *    - String author
 *    - constructor, getters, toString()
 *
 * 4. Create StudentRepository implements Repository<Student>
 *    - Use ArrayList<Student> internally
 *    - Implement all methods
 *
 * 5. Create BookRepository implements Repository<Book>
 *    - Use ArrayList<Book> internally
 *    - Implement all methods
 *
 * 6. In main():
 *    - Add 5 students
 *    - Add 3 books
 *    - Get student by id 2
 *    - Get all books
 *    - Delete student id 1
 *    - Display all remaining students
 *
 * TIME LIMIT: 60 minutes/ Real time takes : 1hr 45min
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericRepositoryPattern {
   public static void main(String[] args) {
       // Creating array of 5 Students
       Student[] students = {
                new Student(1,"Hari",99.9),
                new Student(2,"Gopal Das",89.9),
                new Student(3,"Hari Ram",79.9),
                new Student(4,"Ram Hari",90.9),
                new Student(5,"Sandesh",55.9)
       };
       ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(students));// Array to ArrayList conversion
       StudentRepository studentrepo = new StudentRepository(studentsList);// new obj of StudentRepository class and passing array list !
           // variable scope problem occur if create studentrepository object inside try block !
       // creating ArrayList of 3 Books
       ArrayList<Book> books = new ArrayList<>(3);
       // adding each object !
           books.add(new Book(101,"Hell in a cell","WWE"));
           books.add(new Book(102,"Hell and Heaven","The fallen poet"));
           books.add(new Book(103,"The Courage to be disliked","Unknown"));
       // creating book repository class and passing arraylist
       BookRepository bookrepo = new BookRepository(books);

       // Get student by id 2
       try{
           System.out.println("Getting student by id : 2 :- ");
           Student ref = studentrepo.getById(2);
           System.out.println(ref);
       } catch (StudentNotFoundException e) {
           System.out.println(e.getMessage());
       }
       // Get all books
       System.out.println("Print all books :- ");
       List<Book> allBooks = bookrepo.getAll();
       System.out.println(allBooks);

       // Delete student id 1
           studentrepo.delete(1);
           System.out.println("Deleting student by id : 1 :- ");
           System.out.println("Deleting........................");

       // Displaying all remaining students
       System.out.println("Displaying all remaining students :- ");
       List<Student> allStudents = studentrepo.getAll();
       for(Student s: allStudents){
           //System.out.println(s.toString());
           System.out.println(s);
       }
       // Test 1: Invalid grade
       try {
           Student bad = new Student(10, "Bad", 150);
           studentrepo.add(bad);
       } catch (InvalidGradeException e) {
           System.out.println("Caught: " + e.getMessage());
       }
       // Test 2: Student not found
       try {
           Student found = studentrepo.getById(999);
       } catch (StudentNotFoundException e) {
           System.out.println("Caught: " + e.getMessage());
       }

       // Test 3: Valid operations
       try {
           Student good = new Student(1, "Good", 85);
           studentrepo.add(good);
           Student retrieved = studentrepo.getById(1);
           System.out.println("Success: " + retrieved);
       } catch (Exception e) {
           System.out.println("Unexpected: " + e.getMessage());
       }
    }
}
interface Repository<T>{
    //void add(T item);
    void add(T item);// throws Exception;//InvalidGradeException;
   // T getById(int id);
   T getById(int id);// throws Exception;//StudentNotFoundException;
    List<T> getAll();
    void delete(int id);
}
class Student{
    private int id;
    private String name;
    private double grade;
    // constructor
    public Student(int id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    // getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
    // toString override

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}
class Book{
    private int id;
    private String title;
    private String author;
    // constructor

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    // getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    // Override toString()

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author + "'}";
    }
}
class StudentRepository implements Repository<Student>{// Student type !
    //ArrayList<Student> list = new ArrayList<>();
    List<Student> list = new ArrayList<>();

    // constructor

    public StudentRepository(ArrayList<Student> list){
        this.list = list;
    }

    @Override
    public void add(Student item)// Removed 'throws' clause throws InvalidGradeException
     {
        //if grade < 0 or grade > 100
        if(item.getGrade()<0 || item.getGrade()>100){
            throw new InvalidGradeException("Student's grade can't be negative or more than 100 !");
        }
        list.add(item);
    }

    @Override
    public Student getById(int id)// Removed 'throws' clause throws StudentNotFoundException
{
        //if id not found
        for(Student s : list){
            if(s.getId()==id){
                return s;
            }
        }
        throw new StudentNotFoundException("Student id : "+id+" not found in list !");
    }

    @Override
    public List<Student> getAll() {
        //if(list.isEmpty()){
        //    return null;
        //}
        return list;
    }

    @Override
    public void delete(int id){
        for(Student s : list){
            if(s.getId() == id){
                list.remove(s);
                return;
            }
        }
        System.out.println("Cannot delete - ID not found: ");
    }
}
class BookRepository implements Repository<Book>{
    ArrayList<Book> list = new ArrayList<>();

    public BookRepository(ArrayList<Book> list) {
        this.list = list;
    }

    @Override
    public void add(Book item) {
        list.add(item);
    }

    @Override
    public Book getById(int id) {
        for(Book b: list){
            if(b.getId()==id){
                return b;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAll() {
        return list;
        //return List.copyOf(books);
    }

    @Override
    public void delete(int id) {
        for(Book b: list){
            if(b.getId()==id){
                list.remove(b);
                return;
            }
        }
        System.out.println("ID not found !");
    }
}