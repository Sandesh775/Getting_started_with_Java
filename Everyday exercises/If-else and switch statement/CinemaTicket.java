// Not a good / optimal code but gives a good understanding of if-elseif-if ladder structure !
import java.util.Scanner;
public class CinemaTicket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // starting base fare with normal / basic parameter : Nepali movie according to age
        double childfare = 150;
        double adultfare = 250;
        double seniorfare = 200;
        char ch;
        boolean isFestival;
        String age;
        System.out.println("Welcom to Gorkha Cinema hall :");
        System.out.println("Choose which language movie you want to watch ? :");
        System.out.print("1 for Nepali\t2 for Hindi\t3 for English:\n");
        int choose = sc.nextInt();
        sc.nextLine();  // consume leftover newline, so that Enter key (\n) won't stays in the buffer.
        if(choose == 2)
        {
            System.out.print("Are you child , adult or senior : enter text here :  ");
            age = sc.nextLine();
            if(age.equalsIgnoreCase("child"))
            {
                childfare += 50;
                System.out.println("Are you a Student (Y/N): ");
                ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y')
                {
                    childfare -= (0.20*childfare);
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        childfare -= (0.15*childfare);
                        System.out.println("Here is your final fare : "+childfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+childfare);
                    }
                }
                else
                {
                   System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        childfare -= (0.15*childfare);
                        System.out.println("Here is your final fare : "+childfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+childfare);
                    } 
                }
            }
            else if(age.equalsIgnoreCase("adult"))
            {
                adultfare += 50;
                System.out.println("Are you a Student (Y/N): ");
                ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y')
                {
                    adultfare -= (0.20*adultfare);
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        adultfare -= (0.15*adultfare);
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                }
                else
                {
                   System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        adultfare -= (0.15*adultfare);
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                    else
                    {
                       System.out.println("Here is your final fare : "+adultfare); 
                    } 
                }
            }
        else if(age.equalsIgnoreCase("senior"))
        {
                seniorfare += 50;
                System.out.println("Are you a Student (Y/N): ");
                ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y')
                {
                    seniorfare -= (0.20*seniorfare);
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival == true)
                    {
                        seniorfare -= (0.15*seniorfare);
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                }
                else
                {
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival == true)
                    {
                        seniorfare -= (0.15*seniorfare);
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                }
        }
        }      
        else if(choose == 3)
        {
            System.out.print("Are you child , adult or senior : enter text here :  ");
            age = sc.nextLine();
            if(age.equalsIgnoreCase("child"))
            {
                childfare += 100;
                System.out.println("Are you a Student (Y/N): ");
                ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y')
                {
                    childfare -= (0.20*childfare);
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        childfare -= (0.15*childfare);
                        System.out.println("Here is your final fare : "+ childfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+childfare);
                    }
                }
                else{
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        childfare -= (0.15*childfare);
                        System.out.println("Here is your final fare : "+ childfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+ childfare);
                    }
                }
            }
            else if(age.equalsIgnoreCase("adult"))
            {
                adultfare += 100;
                System.out.println("Are you a Student (Y/N): ");
                ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y')
                {
                    adultfare -= (0.20*adultfare);
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        adultfare -= (0.15*adultfare);
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                }
                else
                {
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        adultfare -= (0.15*adultfare);
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+adultfare);
                    }
                }
            }
            else if(age.equalsIgnoreCase("senior"))
            {
            seniorfare += 100;
                System.out.println("Are you a Student (Y/N): ");
                ch = sc.next().charAt(0);
                if(ch == 'Y' || ch == 'y')
                {
                    seniorfare -= (0.20*seniorfare);
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        seniorfare -= (0.15*seniorfare);
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                }
                else
                {
                    System.out.println("Is there any festival ?(true/false): ");
                    isFestival = sc.nextBoolean();
                    if(isFestival)
                    {
                        seniorfare -= (0.15*seniorfare);
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                    else
                    {
                        System.out.println("Here is your final fare : "+seniorfare);
                    }
                }
            }
        }
        else if(choose == 1)
        {
            //price is default 
            System.out.print("Are you child , adult or senior : enter text here :  ");
            age = sc.nextLine();
            if(age.equalsIgnoreCase("child"))
            {
            System.out.println("Here is you final ticket price : "+childfare);
            }
            else if(age.equalsIgnoreCase("adult"))
            {
                System.out.println("Here is you final ticket price : "+adultfare);
            }
            else if(age.equalsIgnoreCase("senior")){
                System.out.println("Here is you final ticket price : "+seniorfare);
            }
        }
        else
        {
            System.out.println("Nothing else where to go for that option you choose !");
        }
    }
}
// Alternative and optimal one is comming up in next program with usage of methods/function, use of switch , and creating a class seperate to function in well structured form.