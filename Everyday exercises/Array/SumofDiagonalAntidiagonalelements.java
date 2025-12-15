// a program to find the sum of both diagonal and anti-diagonal element of a square matrix , and we will use Scanner to take inputs
import java.util.Scanner;
public class SumofDiagonalAntidiagonalelements{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Order of matrix m × n ");
        System.out.println("Number of rows and columns must be equal in order to calculate further operation !");
        int row;
        int column;
        while(true){
            System.out.println("Enter the number of rows(m) : ");
            row = sc.nextInt();
            System.out.println("Enter the number of column(n) : ");
            column = sc.nextInt();
            if(row == column){
                break;
            }
        }
        // declaration of matrix 
        int [][] squarematrix = new int[row][column];
        for(int i = 0; i<squarematrix.length; i++){// accessing row
                System.out.println("Enter elements for row no : "+(i+1));
            for(int j = 0; j<squarematrix[0].length; j++){// accessing the elements of row not reading columns 
                System.out.println("Enter a value/element of ij:"+i+j+": ");
                squarematrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is you matrix :");
        for(int i = 0;i<squarematrix.length;i++){
            for(int j = 0;j<squarematrix.length;j++){
                System.out.print(squarematrix[i][j]+"\t");
            }
            System.out.println("");
        }
        // now finding the sum of both diagonal and anti diagonal elements of matrix
        int sum1 = 0;
        for(int i = 0;i<squarematrix.length; i++){
            for( int j = 0; j<squarematrix[0].length;j++){
                if(i == j){
                    sum1 += squarematrix[i][j];
                }
                if((i+j) == (row-1)){ 
                        sum1 += squarematrix[i][j];
                    }
            }
        }
        System.out.println("Here is the sum of both diagonal and anti diagonal elements : "+sum1);
    }
}
/**
 * optimal way :
 * for(int i = 0; i < row; i++){
    sum1 += squarematrix[i][i];             // main diagonal
    sum1 += squarematrix[i][row-1-i];       // anti-diagonal
}
 */