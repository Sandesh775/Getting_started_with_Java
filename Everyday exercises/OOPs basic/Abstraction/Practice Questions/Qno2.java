/*
* * EDGE CASE: Multi-Operand Calculator
 *
 * SCENARIO:
 * You're building a calculator that evolves over time:
 *
 * PHASE 1 - Basic Calculator:
 * - Can add/subtract 2 numbers
 *
 * PHASE 2 - Advanced Calculator:
 * - Can add/subtract 3 numbers
 *
 * PHASE 3 - Scientific Calculator:
 * - Can add/subtract ANY number of numbers (varargs)
 *
 * YOUR TASK:
 * Design this using interfaces so that:
 * 1. Each phase ADDS new capability WITHOUT breaking old code
 * 2. A single calculator class can do ALL operations
 * 3. Code must be extensible for future phases
 *
 * CONSTRAINTS:
 * - Must use interfaces (not inheritance)
 * - One class should implement ALL capabilities
 * - Old code using Phase 1 should still work with new calculator
 *
 * QUESTION:
 * Why is this edge case better solved with interfaces rather than
 * multiple inheritance? What problems would multiple inheritance cause here?
 * */
public class Qno2 {
    public static void main(String[] args) {
        MultiOperandCalculator c1 = new MultiOperandCalculator();
        int twosum = c1.add(5,5);
        int threesum = c1.add(5,5,9);
        int foursum = c1.add(1,2,3,4);// Can add/subtract ANY number of numbers (varargs)
        int fivesum = c1.add(10, 20, 30, 40, 50);
        System.out.println("Two sum : "+twosum+"\t Three sum : "+threesum+"\t Four sum : "+foursum+"\t Fivesum : "+fivesum);
    }
}
interface BasicCalculator{
    int add(int n1, int n2);
}
interface AdvancedCalculator{
    int add(int n1, int n2, int n3);
}
interface ScientificCalculator{
    int add(int ... numbers);
}
class MultiOperandCalculator implements BasicCalculator,AdvancedCalculator,ScientificCalculator{
    @Override
    public int add(int a,int b){
       return (a+b);
    }
    @Override
    public int add(int a,int b, int c){
        return (a+b+c);
    }
    @Override
    public int add(int ... numbers) {
        //         int[] array
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}