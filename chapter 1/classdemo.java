class calculator{   //creating class name calculator from where we get done our add operation through method 
        int a; // a class also can have variables too
        // int here is return type of data from method add() to the place wherever it get called !!
    public int add(int n1, int n2){  // method name add() inside class 
        int r = n1 + n2;
        return r;
    }
}
class classdemo{
    public static void main(String a[]){
        int num1 = 45;
        int num2 = 35;
        int result;
    // calling calculator class in this class by creating reference variable of type calculator which can access the method of claculator class &
    //  then  we can create new object after accessing method, with the help of reference variable
        calculator calc = new calculator();
        // calculator = type just like int, float but not primitive like them it is cusmot data type
        // calc = reference variable ( is variable type of calculator)
        // new calculator() = creating a new object of type calculator 
        result = calc.add(num1,num2); // calling add() method and storing return value in result also passing num1 and num2 as values 
        System.out.println("The result we get from add class is "+result);
    }
}