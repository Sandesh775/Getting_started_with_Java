class multidimensionarray{
    public static void main(String a[]){
        /*int num1[] = {1,2,3};  one dimension array, or linear array
        int num2[] = {4,5,6};
        int num3[] = {7,8,9}; */
        // instead creating seperate array , can't we create one single array containing arrays 
        // just like the basic concept of array how seperate integer values got integrated into one single thing called array
        // here comes the concept of multi-dimensional array : array of array !
        int nums[][] = new int[4][6]; // it is 2D array
        nums[2][5]= 5;
        nums[3][3] = 50;
        nums[1][4] =36;
        nums [3][5]=69;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<6;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}