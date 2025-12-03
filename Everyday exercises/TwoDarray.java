// simple program to declaration and intitalization of two dimensional array
public class TwoDarray{
    public static void main(String[] args){
        int [][] matrix = new int[3][3];
        // now initializing array
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix.length;j++){
                matrix[i][j] = i+j;
            }
        }
        // printing array
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}