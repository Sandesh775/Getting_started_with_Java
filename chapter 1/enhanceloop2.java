import java.util.Scanner;
class enhanceloop2 {
    public static void main(String a[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many objects of student do you want : ");
        int n = scan.nextInt();
        student array[] = new student[n];
        int sum = 0;
        for (int i = 0;i<array.length;i++){
            array[i] = new student();
            System.out.println("Enter details of student object"+(i+1)+" rollno & marks :");
            array[i].rollno = scan.nextInt();
            array[i].marks = scan.nextInt();
            sum += array[i].marks;
        }
        int average = sum/n;
        for( student stud : array){
            System.out.println("Roll no : "+stud.rollno+" Marks : "+stud.marks);
        }
            System.out.println("Average marks is "+average);
         scan.close();
    }
}
class student {
    int rollno;
    int marks;
}