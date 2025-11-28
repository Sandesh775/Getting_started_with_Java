class array 
{
    public static void main(String a[])
    {   
        int num[] = { 1,2,3,4,5,6,7,8,9}; // creating array with fixed data and values
        // assigning values to the array
        int num2[] = new int[3]; // creating array with fixed size but data are empty 
        num[5] = 55; // changing the value of an array at the index 5
        System.out.println(num[0]);
        System.out.println(num2[0]); 
        // print array num2 before assigning any value by default it is zero for all
        System.out.println("----------------------------------------");
        num2[0] = 5;
        num2[1] = 55;
        num2[2] = 555;
        for( int i = 0;i<3;i++){  // also i <= 2, both thing is same 
            System.out.println(num2[i]);
        }
    }
}