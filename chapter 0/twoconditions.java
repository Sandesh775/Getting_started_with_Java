class twoconditions{
    public static void main( String args[]){
        int a = 5, b= 10;
        int x = 13, y = 2;
        boolean result = x > y && a < b;
        System.out.println("x > y && a < b : "+ (result));
        result = x > y || a < b;
        System.out.println("x > y || a < b : "+ (result));
        result = a == b;
        System.out.println("a = "+a +" b = "+b+" Checking a == b , result = !result");
        System.out.print(!result);
    }
}