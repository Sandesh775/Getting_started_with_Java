// this program demonstrates the sum of anti diagonal elements in square matrix
public class AntiDiagonal{
    public static void main(String[] args){
        int [][] squarematrix = {//Matrix initialization in Java is row-wise
    {1, 2, 3, 50},
    {4, 5, 6, 60},
    {30, 45, 50, 500},
    {49, 69, 69, 69}
            };
        int sum = 0;
        int l = squarematrix.length;
        for(int i = 0; i<squarematrix.length;i++){
            for(int j = 0;j<squarematrix.length;j++){
                System.out.printf(squarematrix[i][j]+"\t");
            }
            System.out.printf("\n");
        }
        System.out.println("Here are ani-diagonal elements from aboved matrix :");
        for(int i = 0; i<squarematrix.length; i++){
            for(int j = l-1; j>=0; j--){//for(int j = squarematrix.length-i; j>=0; j--){
                
                System.out.println("A[ij] : "+i+ ""+ j+" = "+squarematrix[i][j]);
                sum += squarematrix[i][j];
                break;
            }
            l--;
        }
        System.out.println("here is the sum of anti-diagonal elements : "+sum);
    }
}