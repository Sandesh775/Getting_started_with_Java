class relationaloperators
{
    public static void main (String args[]){
        int a = 6, b = 6;
        boolean result = a<b;
        System.out.println("a = 6 , b = 6 ");
        System.out.println("Checking a < b = "+ (result));
        result = a<=b; // or a>=b
        System.out.println("CHecking a <= b ="+ (result));
        result = a==b;
        System.out.println("Checking a == b = "+(result));
        result = a!=b;
        System.out.print("Checking a!=b ="+(result));
    }
}