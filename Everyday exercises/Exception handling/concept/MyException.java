// Basic Syntax for custom exception
public class MyException extends Exception{
        public MyException(String message) {
            super(message);  // Pass message to parent Exception class
        }
}