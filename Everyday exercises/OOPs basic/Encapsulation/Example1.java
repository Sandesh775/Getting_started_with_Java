public class Example1{
    public static void main(String [] args){
        Student s1 = new Student();
        System.out.println("Before setting roll no and name :");
        System.out.println("Roll no : "+s1.getRollno()+" Name : "+s1.getName());
        s1.setRollno(1001);// we are setting values not like usual manually way but through getters and setters
        s1.setName("Ram");// which are basically methods, becasue variables are private we use them to get access
        System.out.println("After setting roll no and name :");
        System.out.println("Roll no : "+s1.getRollno()+" Name : "+s1.getName());
    }
}
class Student {
        private int rollno;// rollno and name both are private so in order to get access of them
        // we need getters to get value and setter to set value, ie modify
        private String name;
        public int getRollno(){
            return rollno;
        }
        public String getName(){
            return name;
        }
        public void setRollno(int roll){
            rollno = roll;
        }
        public void setName(String studname){
            name = studname;
        }
}