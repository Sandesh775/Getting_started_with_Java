class conversion {
    public static void main (String args[]){
        int a = 45;
        float b ;
        // now i am going to convert a variable type into float , which is called type casting 
        b = (float)a;
        System.out.println(b);
        // same goes with float to int
        float x = 4.98f;
        int y = (int)x;
        System.out.println(y);
        byte c = 127;
        int d = c; // implict conversion smaller into larger
        int e = 126;
        c = (byte)e;// explict conversion larger into smaller
        System.out.println(d);
        System.out.println(c);
        // type promotion byte range -128  to  127
        byte j = 80;
        byte k = -100;
        int result = j*k;
        System.out.print(result);
    }
}