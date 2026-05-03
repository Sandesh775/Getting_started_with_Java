// Write a java program to find the largest number from given three
// numbers using conditional operator
public class ExamQ {
    public static void main(String[] args) {
        int a = 5, b = 90, c= 0;
        int largest;
        largest = (a>b)?
                        (a>c)?a:c
                       :
                        (b>c)?b:c;
        System.out.println("Largest number among three is "+largest);
    }
}