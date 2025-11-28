import java.util.Scanner;
class do_while{
    public static void main ( String[]args){
        Scanner sc = new Scanner(System.in);
        int magic_num ;
        do{
            System.out.println("Guess the magic number : ");
            magic_num = sc.nextInt();
        }while(magic_num != 69);
    System.out.println("🎉 Correct! The magic number is " + magic_num);
    sc.close();
    }
}
/*
class do_while{
    public static void main( String args[]){
    int num = 5;
    do {
        System.out.print("Hello !");
        i++;
    }while(num <= 5);
    }
}
 */