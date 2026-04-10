//Exercise 7: Modifying Through References
//Create a class Box with an integer value field. Write two methods:
//        •	One method takes a Box reference and changes the value inside the box to 99
//        •	Another method takes a Box reference and assigns it to a new Box object with value 100
//        In main, create a Box with value 10. Call both methods.
//        After each call, what is the value of the original box?
//        Why does one method change the original and the other does not?
// second one doesn't change because it is just assigning one ref variable to another ref variable,
// so now b will point to new object with is a local variable in stack of method assignObj which doesn't effect
// to the original pointer obviously !
public class Exercise7 {
    public static void main(String[] args) {
        Box box = new Box(10);
        box.changeValue(box);
        System.out.println(box.field);
        box.assignObj(box);
        System.out.println(box.field);
    }
}
class Box{
    int field;
    Box(int value){
        this.field = value;
    }
    public void changeValue(Box b){
        b.field = 99;
    }
    public void assignObj(Box b){
        Box obj = new Box(100);
        b = obj;
    }
}