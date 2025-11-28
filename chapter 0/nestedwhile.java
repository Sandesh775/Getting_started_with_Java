class nestedwhile{
    public static void main ( String a[]){
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            int j = 1;// reset j for each new i
            while(j <= 5){
                System.out.println(i+"."+j);
                j++;
            }
            i++;
            System.out.println("----------------------------------");
        }
    }
}
/* i = 1 j= 1 to 5
   i = 2 j= 1 to 5
   i = 3 j = 1 to 5
   i = 4 j = 1 to 5
   i = 5 j = 1 to 5 
   */