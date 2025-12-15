/**This code is very basic demonstration which show the very nature of single dimension array
 * How to initialize and syntax :
 */
public class OneDarray{
    public static void main(String [] args){
        int [] arr = new int[5];// created array , declare
    // manually assigining :
    arr[0] = 5;
    arr[1] = 55;
    arr[2] = 555;
    arr[3] = 50;
    arr[4] = 1000;
    // here is another way
    int [] numbers = new int[]{5, 55, 555, 50, 1000};
    //               index :  0   1   2    3   4
    /**Breakdown :
     * int[] numbers;                        // Declaration
       numbers = new int[]{5, 55, 555, 50, 1000};   // Initialization + assignment
     */
    // here array can hold 5 - n elements , but index goes to n-1
    // printing array elements 
    for (int i = 0; i < numbers.length ; i++){
        System.out.print(numbers[i]+"\t");
    }
    }
}