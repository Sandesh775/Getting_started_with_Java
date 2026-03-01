package Interfaces;

public class Main1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        B obj2 = new B();
        obj2.show();
        System.out.println("value : "+A.value+" word : "+A.word);// since instance variable are static
    }
}