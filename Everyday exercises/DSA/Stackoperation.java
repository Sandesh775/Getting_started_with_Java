import java.util.Scanner;
public class Stackoperation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        int tos = -1;
        int op = 0;
        System.out.println("Enter number of array (max size 100): ");
        int num = sc.nextInt();
        do{
        System.out.print("\n1:Push\n2:Pop\n3:Display\n4:Exit\n");
        System.out.println("Choose one of the opearation : ");
        op = sc.nextInt();
        switch(op){
            case 1:
                tos = Push(arr,tos,num);
                break;
            case 2:
                tos = Pop(arr,tos,num);
                break;
            case 3:
                Display(arr,tos);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid operation choosen !");
                return;
        }
        }while(op != 4);    
    }
    public static int Push(int []array,int tos, int num){
            Scanner sc = new Scanner(System.in);
            if(tos == num-1){
                System.out.println("Stack is overflow !");
            }
            else{
                System.out.println("Enter a value for stack");
                array[tos+1] = sc.nextInt();
                tos++;
            }
            return tos;
    }
    public static int Pop(int []array,int tos, int num){
            if(tos == -1){
                System.out.println("Stack is underflow !");
            }
            else{
                array[tos] = 0;
                tos--;
            }
            return tos;
    }
    public static void Display(int []array,int tos){
                for(int i = 0; i <= tos; i++){
                System.out.print(array[i]+"\t");
                }  
            }
}
