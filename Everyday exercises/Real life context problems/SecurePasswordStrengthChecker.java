import java.util.Scanner;
public class SecurePasswordStrengthChecker{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String password = sc.nextLine();
        boolean hasUpper = false ;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false ;
        boolean hasMinLength = false;
        char [] string = new char [password.length()];// String is array of characters , and string are immutable
        String special = "!@#$%^&*()_-";
        char ch;
        // convert String to array of characters and assigning characters manually 
        if(password.length()>=8){
            hasMinLength = true;
        }
        for(int i = 0; i<password.length(); i++){
            string[i] = password.charAt(i);
            ch = special.charAt(i);
        if(Character.isUpperCase(string[i])){
                hasUpper = true;
            }
        else if(Character.isLowerCase(string[i])){
                hasLower = true;
            }
        else if(Character.isDigit(string[i])){
                hasDigit = true;
            }  
        else if(string[i] == ch){
                hasSpecial = true;
        }
        }
        if(hasDigit && hasLower && hasMinLength && hasSpecial && hasUpper){
            System.out.println("Your password is strong ");
        }
        else if(hasDigit && hasSpecial && hasUpper){
            System.out.println("Your password is medium ");
        }
        else{
            System.out.println("Your password need some attention !!");
        }
    }
}
/**Alternative but not so optimal :
 * if(password.length()>8){
              lenstrength++;  
            }
        for(int i = 0; i<password.length(); i++)
        {
            string[i] = password.charAt(i);
            if(Character.isUpperCase(string[i])){
                upperstrength++;
            }
            else if(Character.isLowerCase(string[i])){
                lowerstrength++;
            }
            else if(Character.isDigit(string[i])){
                digitstrength++;
            }
            else if(string[i] == '!'|| string[i] == '@' ||string[i]== '#'||string[i]== '$'|| string[i]== '%' || string[i]== '^' || string[i]== '&'|| string[i]== '*'){
                specialstrength++;
            }
        }
        //     if(password.length<8)
        //      {
        //     System.out.println("Your password length must contain at least 8 characters !");
        //     if()
        //      }
        if(lenstrength==1 && upperstrength>=1 && lowerstrength>=1 && digitstrength>=1 && specialstrength>=1){
            System.out.println("Your password is strong");
        }
        else if((lenstrength==1 || upperstrength>=1 || lowerstrength>=1) && (digitstrength<=1 && specialstrength<=1)){
            System.out.println("Your password is medium");
        }
        else{
            System.out.println("Your password need some attention !");
        }
 */