class literal {
    public static void main (String args[]){
        int num1 = 7;
        System.out.println(num1);
        int num2 = 0b111;
        System.out.println(num2);
        int num3 = 0x07;
        System.out.println(num3);
        double num4 = 45; // here int will be adjust to float accordingly 
        System.out.println(num4);
        int num5 = 50_00;  // 50_00 = 5000
        System.out.print(num5);
    }
}