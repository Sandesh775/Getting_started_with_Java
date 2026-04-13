import java.util.*;
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size for an array : ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.println("Now enter data for array : ");
        for (int i = 0;i< array.length; i++){
            System.out.println("A["+i+"] : ");
            array[i] = sc.nextInt();
        }
        try {
            System.out.println("Elements have been entered successfully now enter index to access value : ");
            int index = sc.nextInt();
            System.out.println("Element a["+index+"] is "+array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception encountered ! : "+e.getMessage());
        }
        System.out.println("Program continues !!!....even after exception occurred or not !");
    }
}