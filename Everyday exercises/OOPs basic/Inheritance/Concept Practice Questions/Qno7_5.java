/*
* Write a java program to develop calculator application (add, subtract,
multiplication and division) using multiple inheritance.
* */
public class Qno7_5 {
    public static void main(String[] args) {
        System.out.println("=== CALCULATOR APPLICATION ===\n");

        // Using the concrete class
        CalculatorApplication app = new CalculatorApplication(10, 5);
        app.add();
        app.subtract();
        app.multiplication();
        app.division();

        // Demonstrating polymorphic behavior
        System.out.println("\n=== POLYMORPHIC BEHAVIOR ===");
        SimpleCalculator1 calc1 = new CalculatorApplication(20, 4);
        SimpleCalculator2 calc2 = new CalculatorApplication(20, 4);

        calc1.add();      // Can only access add/subtract
        calc1.subtract();
        calc2.multiplication();  // Can only access multiply/divide
        calc2.division();
    }
}
class CalculatorApplication implements SimpleCalculator1,SimpleCalculator2{// Two variable support only
    double operand1;
    double operand2;
    CalculatorApplication(double variable1, double variable2){
        this.operand1 = variable1;
        this.operand2 = variable2;
    }
    @Override
    public void add() {
        System.out.println("Addition of two operands is : "+(operand1+operand2));
    }

    @Override
    public void subtract() {
        System.out.println("Subtraction of two operands is : "+(operand1-operand2));
    }

    @Override
    public void multiplication() {
        System.out.println("Multiplication of two operands is : "+(operand1*operand2));
    }

    @Override
    public void division() {
        System.out.println("Division of two operands is : "+(operand1/operand2));
    }
}
interface SimpleCalculator1{// Two variable support only
    public void add();
    public void subtract();
}
interface SimpleCalculator2{
    public void multiplication();
    public void division();
}