// program to find the sum of diagonal in sqaure matrix where order is same 2*2 or 3*3 etc
public class DiagonalSum{
    public static void main(String[] args){
        int [][] squarematrix = {//Matrix initialization in Java is row-wise
    {1, 2, 3, 50},
    {4, 5, 6, 60},
    {30, 45, 50, 500},
    {49, 69, 69, 69}
            };
        int sum = 0;
        for(int i = 0; i<squarematrix.length; i++){
        for(int j = 0; j<squarematrix.length; j++){
            if(i==j){
                sum += squarematrix[i][j];
            }
        }
    }
    System.out.println("Sum of diagonal elements : "+sum);
    }
}