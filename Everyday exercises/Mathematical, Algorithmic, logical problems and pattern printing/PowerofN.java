import java.util.Scanner;
public class PowerofN{
    public static int powerFind(int n, int p){
        if(n == 1 && p == 0 || (n == 1 && p == 1)){
            return 1;
        }
        else if( p == 0){
            return 1;
        }
        else{
            return n*(powerFind(n,p-1));
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter a power for that number  : ");
        int power = sc.nextInt();
        int result = powerFind(num, power);
        System.out.println("Here is the result for "+num + " power "+power+" : "+result);
    }
}