import java.util.Scanner;
public class Smallexamevaluationsystem{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers of student's record you want to store :  ");
        int n = sc.nextInt();
        sc.nextLine();
        String [] names = new String[n];
        int [][] marks = new int[n][3];// for now we are recording 3 subject of each student so column is fixed !
        for(int i = 0; i < n; i++){
            System.out.println("Enter the name of student : no :"+(i+1)+":   ");
            names[i] = sc.nextLine();
            System.out.println("Enter marks record of "+names[i]);
            for(int j = 0; j < 3 ; j++){
                    System.out.println("Enter mark of subject no "+(j+1)+" : ");
                    marks[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }
        System.out.println("Result Published");
        for(int i = 0; i < n; i++){
            System.out.println("Name of student : no :"+(i+1)+":"+names[i]);
            System.out.println("Marks record");
            for(int j = 0; j < 3 ; j++){
                    System.out.print("\n");
                    System.out.println("Subject no :  "+(j+1)+"\t");
                    System.out.print("\t\t"+marks[i][j]);
                    System.out.print("\t");
            }
        }
    }
}