// Create custom exceptions:
// - InvalidUsernameException (username length < 3)
// - InvalidPasswordException (password length < 8)
// - AccountLockedException (too many failed attempts)
//
// Method: login(username, password, failedAttempts)
// Main: Test login failures
//Independent operations → SEPARATE try-catch blocks
//Dependent validations → SINGLE try-catch block
// Single method with validations (one try-catch is fine)
/*
* eg:-
* // ✅ Correct - if username fails, password shouldn't be checked
try {
    checkUsername();   // If this fails
    checkPassword();   // This shouldn't run
    checkAge();        // This shouldn't run
} catch (Exception e) { }
* */
public class LoginSystem {
    static int failedAttempts = 0;

    public static void main(String[] args) {
        // Simulate 3 failed logins
        for(int i = 1; i <= 4; i++) {
            System.out.println("\n=== Attempt " + i + " ===");
            try {
                login("Hari", "wr");
            } catch (InvalidUsernameException1 | InvalidPasswordException e) {
                System.out.println("Error: " + e.getMessage());
                failedAttempts++;  // Increment on failure
                System.out.println("Failed attempts: " + failedAttempts);
            } catch (AccountLockedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void login(String username, String password)
            throws InvalidUsernameException1, InvalidPasswordException, AccountLockedException {

        // Check if account is locked
        if(failedAttempts >= 3) {
            throw new AccountLockedException("Account locked! Too many failed attempts.");
        }

        // Validate credentials (simplified for demo)
        if(username.length() < 3) {
            throw new InvalidUsernameException1("Username too short!");
        }
        if(password.length() < 8) {
            throw new InvalidPasswordException("Password too short!");
        }

        // Successful login - reset counter
        failedAttempts = 0;
        System.out.println("Login successful! Welcome " + username);
    }
}
class InvalidUsernameException1 extends Exception{
     InvalidUsernameException1(String message){
        super(message);
    }
}
class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message){
        super(message);
    }
}
class AccountLockedException extends Exception{
    AccountLockedException(String message){
        super(message);
    }
}
/*
* public class LoginSystem {
    static int failedAttempts = 3;
    public static void main(String[] args) {
        try {
            login("Ha","123Nepal@#$");
        }catch (InvalidUsernameException1 e){
            System.out.println("Error : "+e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println("Error : "+e.getMessage());
        } catch (AccountLockedException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static void login(String username, String password)throws InvalidUsernameException1, InvalidPasswordException, AccountLockedException{
        if(failedAttempts>3){
            throw new AccountLockedException("Too many failed attempts try after 24 hours !");
        }
        if(username.length()<3){
            failedAttempts++;
            if(failedAttempts>3){
                throw new AccountLockedException("Too many failed attempts try after 24 hours !");
            }
            throw new InvalidUsernameException1("Username must be more than 3 character token entered : "+username);
        }
        if(password.length()<8){
            failedAttempts++;
            if(failedAttempts>3){
                throw new AccountLockedException("Too many failed attempts try after 24 hours !");
            }
            throw new InvalidPasswordException("Password must be of length more than 8 characters !");
        }
        System.out.println("User : "+username+" login successfully !");
    }
}
class InvalidUsernameException1 extends Exception{
    InvalidUsernameException1(String message){
        super(message);
    }
}
class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message){
        super(message);
    }
}
class AccountLockedException extends Exception{
    AccountLockedException(String message){
        super(message);
    }
}
* */