import java.util.Scanner;
public class FindOddNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        int sum_odd = 0;
        if(num <= 1){
            System.out.println("Enter number above 1 !");
            return;
        }
        for(int i = 1; i <= num; i++){
            if( i % 2 == 0){
                continue;
            }
            else{
                System.out.print(i+"\t");
                sum_odd += i;
                
            }
        }
        System.out.println("");
        System.out.println("Sum of odd elements upto N : "+num+" : "+sum_odd);
    }
}