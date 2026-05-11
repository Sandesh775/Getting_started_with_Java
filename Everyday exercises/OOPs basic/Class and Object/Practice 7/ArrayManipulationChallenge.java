/*
Problem 3: Array Manipulation Challenge
Given array: {3, 7, 1, 9, 2, 5}

Write ONE program that:
1. Finds largest and smallest
2. Reverses array in-place
3. Counts even and odd
4. Finds sum of elements
5. Checks if array contains a palindrome pattern
   (e.g., {1,2,3,2,1} is palindrome)

Display all results neatly.

* */
import java.util.Arrays;
public class ArrayManipulationChallenge {
    public static void main(String[] args) {
        int [] array = {3, 7, 1, 9, 2, 5};
        System.out.println("Array : ");
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        //System.out.println("Largest and Smallest values in array : "+Arrays.toString(largestAndSmallest(array)));
        int[] result = largestAndSmallest(array);
        System.out.println(" ");
        System.out.println("Largest : "+result[0]+" Smallest : "+result[1]);
        System.out.println(" ");
        System.out.println(countEvenOdd(array));
        System.out.println(" ");
        System.out.println("Sum of elements : "+sumOfElements(array));
        System.out.println(" ");
        System.out.println("Does array contains a palindorme pattern ? "+checkPalindorme(array));
        System.out.println(" ");
        reverseInplace(array);
        System.out.println("Reverse array in place : ");
        System.out.println(Arrays.toString(array));
    }
    public static int[] largestAndSmallest(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for( int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return new int[]{max,min};// returning both values in array
    }
    public static void reverseInplace(int [] arr){
        int n  = arr.length;
        for( int i = 0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static String countEvenOdd(int [] arr){
        int totalEven = 0;
        int totalOdd = 0;
        for( int i  = 0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                totalEven++;
            }
            else {
                totalOdd++;
            }
        }
        return "Total even count : "+totalEven+" Total odd count : "+totalOdd;
    }
    public static int sumOfElements(int [] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public static boolean checkPalindorme(int[] arr){
        boolean isPalin = true;
        int n = arr.length;
        for(int i = 0; i<arr.length/2; i++){
            if(arr[i] != arr[n-i-1]){
//                isPalin = false;
//                break;
//                isPalin = false;
//                return isPalin;
                return false;
            }
        }
        return isPalin;// return true;
    }
}