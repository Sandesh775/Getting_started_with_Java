class forloop2{
    public static void main(String a[]){
        for(int i = 1; i<=7;i++){
            System.out.println("Day"+i);
            for(int j = 1;j<=9;j++){
                if(j>4){
                    System.out.print((j+8)+"PM"+"\t");
                }
                else
                System.out.print((j+8)+"AM"+"\t");
            }
            System.out.println("-------------------------");
        }
    }
}