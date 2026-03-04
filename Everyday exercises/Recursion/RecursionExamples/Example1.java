package RecursionExamples;

public class Example1 {
    public static void main(String[] args) {// we can see first call is made from main() ?!
        int num = 5;
        print(1);
    }
    public static void print(int i ){
        if(i > 5){ // base condition : Condtion where our recursion will stop
            return;// making new calls after achieving goal of program.
        }
        System.out.println(i);
        print(i+1);// every function call will take a separate memory in the stack, every call is a separate call !
    }
}