public class MultipleCatchBlocksWithFinally {
    public static void main(String[] args) {
        int [] arr = {10,20,34,50};
        int a = 10;
        int b = 0;
        System.out.println("Array : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("a : "+a+" b : "+b);
        // FIRST TRY BLOCK - for division
        try {
            System.out.println("Division : "+a+" / "+b+" is : "+(a/b));
        }catch (ArithmeticException e){
            System.out.println("Exception 1 : "+e.getMessage());
        }
        // SECOND TRY BLOCK - for array
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception 2 : "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("IF any other exception occurred rather than first 2 \nit will be handled by this catch block \nexception : "+e.getMessage());
        }
        finally {
            System.out.println("This will always executes / run inside finally block !!!");
        }
        System.out.println("Program continues.....");
    }
}
/* if you try running this code it will work because there is only chance to
   occur Exception 2 , but if you place b = 0, or a = 0 and b =0  or a = something b = 0
   it will face exception 1, but catch block will execute of exception 2
   only because program will never visit 47 no line of code , it will proceed though the
   first exception and it's catch block and end program from there.
   It is problem so i have discovered another program for this have a look above !
* public class MultipleCatchBlocksWithFinally {
    public static void main(String[] args) {
        int [] arr = {10,20,34,50};
        int a = 10;
        int b = 2;
        System.out.println("Array : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("a : "+a+" b : "+b);
        try {
            System.out.println(arr[100]);
            System.out.println("Division : "+a+" / "+b+" is : "+(a/b));
        }catch (ArithmeticException e){
            System.out.println("Exception 1 : "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception 2 : "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("IF any other exception occurred rather than first 2 \nit will be handled by this catch block \nexception : "+e.getMessage());
        }
        finally {
            System.out.println("This will always executes / run  at finally block !!!");
        }
        System.out.println("Program continues...");
    }
}
* */