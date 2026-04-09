// Problem 3: Check if a number is a perfect square
public class Problem3 {
    public static void main(String[] args) {
        int n = 313;
        // n^2 = n*n
        int root = (int)Math.sqrt(n);
        if(root * root == n){
            System.out.println(n+" is a perfect square !");
        }
        else {
            System.out.println(n+" isn't a perfect square !");
        }
    }
}