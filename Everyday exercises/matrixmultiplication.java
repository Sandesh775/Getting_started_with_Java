// here we are about to multiply two matrices , If A is m × n and B is p × q ,For multiplication to work: n MUST equal p
public class matrixmultiplication{
    public static void main(String[] args){
        int [] [] A = {{1,2},{2,3}};// 2×2 m*n
        int [] [] B = {{2,3,1},{1,4,2}};// 2×3 p*q
        int [] [] result = new int[2][3];// new int[A.length][B[0].length];
        //                         n  p
        for(int i = 0; i<A.length; i++){// row of A ( reading rows of A matrix)
            for(int j = 0; j<B[0].length;j++){//column of B,  B[0].length which returns the number of columns in the first row in 2D array
            
                for(int k = 0; k<B.length; k++){//row of B or column of A   // A[0].length = B.length, column of A = row of B
                // here reading the elements inside the first column of A matrix as well as row of B matrix 
      /** 2×3 order of result */  result[i][j] += A[i][k]*B[k][j];// k = n = p , which can travel both column and row of both matrices equally at same time !!
                }
            }
        }
        System.out.print("Matrix A : \t");System.out.print("Matrix B : ");
        for(int i = 0;i<A.length;i++){//B.length because both matrices rows are equal
            System.out.println("");
            for(int j = 0;j<A[0].length;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\t");
            for(int j = 0; j<B[0].length;j++){
                System.out.print(B[i][j]+"\t");
            }
        }
        System.out.println("");
        System.out.println("Multiplication of matrix A and B :");
        for(int i = 0;i<result.length; i++){
            for(int j = 0; j<result[0].length; j++){
                System.out.printf(result[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }
}
//"The common dimension n = p allows one index k to traverse both A's columns and B's rows simultaneously, pairing corresponding elements for multiplication."