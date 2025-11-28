class operators{
    public static void main (String args[]){
        int a = 100, b = 50;
        System.out.println("a+b="+(a+b));
        System.out.println("a+b="+(a-b));
        System.out.println("a+b="+(a*b));
        System.out.println("a+b="+(a/b));// quotient 
        System.out.println("a+b="+(a%b));// remainder
        // use of increments
        int num = 20;
        num ++; // num = num + 1;, another also num += 1;
        System.out.println("num with num++  = "+ (num));
        num -= 10;   // num = num - 10; and same goes with /,*
        System.out.println("number after num-=10; = "+ (num));
        // use of decrement operator
        num --;
        System.out.print(num);
        // pre and post increment :
        // int num = 3; result = ++num; System.out.print(num); which is 4 
        // here first increment happen and then fetch the value 
        // int num = 3; result = num++; System.out.print(num); which is 3
        // here first fectch the value and then incremnt the value
    }
}