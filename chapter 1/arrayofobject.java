class arrayofobject {
    public static void main(String a[]){
        // creating objects
        student obj1 = new student();
        obj1.rollno = 10001;
        obj1.name = " Hari";
        obj1.marks = 90;
        student obj2 = new student();
        obj2.rollno = 10002;
        obj2.name = "Ram";
        obj2.marks = 91;
        // creating object of array
        student Students[] = new student[2];  // here student() is a type of data just like int 
                                            // and Students  is a array of  data type student
        // now assigning 2 object at array
        // or we can say creating array of object where each index carry one object
        Students[0] = obj1;
        Students[1] = obj2;
        // printing the value
        // student details
        for(int i =0;i<Students.length;i++){
            System.out.println("Name : "+Students[i].name +"\tRoll_no : "+Students[i].rollno+"\tMarks : "+Students[i].marks);
        }
    }
}
class student{
    int rollno;
    String name;
    int marks;
}