public class minandmaxnumber{
    public static void main(String [] args){
        // declaration and initialization of array
        int [] num = {7, 90, 45, 1, 2, 500, 1000, 0};
        int min = num[0]; // let's assume element at array index : 0 is minumum one
        int max = num[0]; // same with maximum too
        // for(int i = 0; i<num.length; i++){
        //for(int i = 1; i<8; i++){
        //for(int i = 0; i=<num.length-1; i++){
        // whatever we do we just concern with number of iterations to perform task and make sure all indices are covered  ,
        //Loops work based on index, but we use length to know where to stop.
        //i is always an index
        //num.length is the total number of elements
        //Highest valid index = num.length - 1
        // here we need 7 iterations any how either it is : 1 2 3 4 5 6 7 or : 0 1 2 3 4 5 6 7
        for(int i = 1; i<num.length; i++){
            if(min > num[i]){
                min = num[i];
            }
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum number : "+max+"\nMinimum number : "+min);
    }
}