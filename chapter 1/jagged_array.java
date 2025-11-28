class jagged_array{
    public static void main(String a[]){
        int array[][] = new int[5][]; // as you can see there is no dreclaration of no of columns 
        // and jagged concept is no of columns can be differ from one row to another 
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        array[4] = new int[5];
        for(int i = 0; i<array.length; i++){  // i < 5 because lenght of row is known or fixed ?
            for(int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j]+"\t");// in case of tab space use print()-function
            }
            System.out.println(" "); 
        }
    }
}