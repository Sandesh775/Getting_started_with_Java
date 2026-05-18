/*
* Problem 4: Logger System
Create:
Interface Logger with method void log(String message)

Classes FileLogger (prints "Writing to file: " + message) and ConsoleLogger (prints "Console: " + message)

Class Application that takes a Logger in its constructor

Application has method run() that calls log("Application started")

In main(), create Application with FileLogger, call run()

Then create Application with ConsoleLogger, call run()

Question after you code: Does Application know or care which Logger
* */
public class LoggerSystem {
   public static void main(String[] args) {
       FileLogger f = new FileLogger();
       ConsoleLogger c = new ConsoleLogger();
       Application l1 = new Application(f);
       Application l2 = new Application(c);
       l1.run();
       l2.run();
    }
}
interface Logger{
    void log(String message);
}
class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Writing to file: " + message);
    }
}
class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}
class Application{
    Logger logger;
    Application(Logger logger){
        this.logger = logger;
    }
    public void run(){
        logger.log("Application started");
    }
}