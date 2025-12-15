/**This the program for demonstartion of basic use of foreachloop  */
public class foreachloop{
    public static void main(String [] args){
        int [] arr = { 100, 56, 78, 909, 56, 44, 76, 83, 67, 91};
        int sum = 0;
        for( int a : arr){// use for each loop : When you just need all elements sequentially, read-only, and don’t care about the index.
            sum += a;
        }
        System.out.println("Sum of all elements in array : "+sum);
    }
}