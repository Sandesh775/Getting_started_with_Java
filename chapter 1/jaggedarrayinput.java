import java.util.Scanner;
class jaggedarrayinput {
    public static void main(String a[]){
        Scanner input = new Scanner(System.in); // input is a variable responsible for input function
        System.out.println("Enter a no of array/rows: ");
        int rows = input.nextInt(); // num is variable where input value is stored or taken at
        int array[][] = new int[rows][]; // now declaring array with known number of array or rows 
        int columns;
        // for input
        for( int i = 0; i< array.length; i++){ // also i < rows can be in practice
            System.out.printf("Enter a no of array/columns for %d index array:%n",i);//%n → newline (instead of \n while using printf()
            columns = input.nextInt();
            array[i] = new int[columns];
            for (int k = 0; k< array[i].length;k++){
                    System.out.println("Enter data for array["+i+"]["+k+"]: ");
                    array[i][k] = input.nextInt();
            }
        }
        // for output
        System.out.println("Printing entered data : ");
        for(int i = 0; i<array.length;i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.printf(array[i][j]+"\t");
            }
            System.out.println("");
        }
        input.close();
    }
}