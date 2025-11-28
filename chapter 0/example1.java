/*
example 1:
write a simple java program to claclualte simple interest and have input through command line 
*/
public class example1{
    public static void main(String [] args){
        double P = Double.parseDouble(args[0]);// explictly converting string into double
        double T = Double.parseDouble(args[1]);
        double R = Double.parseDouble(args[2]);
        double SI = (P*T*R)/100;
        System.out.println("Simple Interest :  "+SI);
    }
}