import java.util.Scanner;
public class StudentResultanalyzer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which class is it : ");
        int classno = sc.nextInt();
        System.out.println("How many students are there in class : "+classno);
        int student = sc.nextInt();
        Students [] noofStudents = new Students[student];
        sc.nextLine();
        String name;
        for(int i = 0; i<student; i++){
            System.out.println("Enter the name of student no "+(i+1)+": ");
            name = sc.nextLine();
            noofStudents[i] = new Students(name);
            noofStudents[i].claculateMarks(sc);
        }
        for(int i = 0; i<student ; i++){
        System.out.println(noofStudents[i].count_fail);
        System.out.println(noofStudents[i].count_pass);  
        }
    }
}
class Students{
    String name;
    int[] marks = new int[6];
    boolean isPass = true;
    int total;
    int count_pass = 0;
    int count_fail = 0;
    public Students(String name){
        this.name = name;
    }
    public  void claculateMarks(Scanner sc){
        
        for(int i = 0; i<6; i++){
            System.out.println("Enter marks for subject no "+(i+1)+" :");
            marks[i] = sc.nextInt();
            sc.nextLine();
            total += marks[i];
            if(marks[i]<40){
                count_fail++;
            }
            else{
                count_pass++;
            }
        }
        if(count_pass>0){
            isPass = false;
        }
    }
}