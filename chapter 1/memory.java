class print{
    int number = 50 ; // it is a global variable
    public void print(int n1)// n1 here is a local variable 
    // inside method print()
    {
        memory obj3 = new memory();
        System.out.println("Printing data of main() !: "+obj3.data);// accesing instance variable of main() using obj3
        // we can access global variable from anywhere
        // where num is outside of method print()
    }
}
class memory{
    int data = 30; // it is also a global ( instance) variable
    public static void main(String a[]){
            
            print obj = new print();// creating 2 objects
            print obj2 = new print();// obj and obj2 are variables not an object actually
            obj.print(10);
            obj.number = 100; // changing the value of number variable in object , not in class 
          System.out.println("Printing value after changing in object1 : "+obj.number); // here also accessing number ( instance variable ) of object  
          System.out.print("Printing the value of object2 original : "+obj2.number); // accessing number value of object 2
    }
}