// Problem 4: Check if all digits of a number are same
public class Problem4 {
    public static void main(String[] args) {
        int num = 777;
        int temp = num / 10;
        int last = num % 10;
        while (temp > 0) {
            if (temp % 10 != last) {
                System.out.println("All digits of a number are not same : " + num);
                return;
            }
            temp = temp / 10;
        }
        System.out.println("All digits of a number are same : " + num);
    }
}
//        while (temp > 0){
//            if((temp%10) != last){
//                same = false;
//                break;
//            }
//            temp = temp/10;
//        }
//        if(same){
//            System.out.println("All digits of a number are same : "+num);
//        }
//        else {
//            System.out.println("All digits of a number are not same : "+num);
//        }