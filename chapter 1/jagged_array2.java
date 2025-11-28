class jagged_array2{
    public static void main(String a[]){
        int matrix[][] = { 
            {50,45,50,90},  // 0th row, 4 columns
            {1,2},   // 1st row, 2 columns
            {5},     // 2nd row, 1 column
            {36,0,69, 666}, // 3th row, 4 columns
            {1,2,3}     // 4th row, 3 columns
        };
    // imp thing to know about array length and array's row length
    for(int i=0; i < matrix.length;i++){
        for( int j = 0;j< matrix[i].length;j++){
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.println(" ");
    }
    System.out.println("");
    System.out.println("No of array (row): "+matrix.length); // 5 rows 
    System.out.println("");
    System.out.println("No of array in first array, no of columns in first row: "+matrix[0].length);  // 4 columns
    System.out.println("No of array in second array, no of columns in second row: "+matrix[1].length); // 2 columns
    System.out.println("No of array in third array, no of columns in third row: "+matrix[2].length); // 1 column
    System.out.println("No of array in fourth array, no of columns in fourth row: "+matrix[3].length); // 4 columns
    System.out.println("No of array in fifth array, no of columns in fifth row: "+matrix[4].length);  // 3 columns
    }
}