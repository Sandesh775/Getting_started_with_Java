public class Class_and_Object {
    public static void main(String[] args) {
        Phone p1 = new Phone(901);
        Phone p2 = new Phone (100);
        p1.calling();
        p2.calling();
    }
}
class Phone{
    int num;
    Phone(int num){
        this.num = num;
    }
    public void calling(){
        System.out.println("Calling from "+this.num);
    }
}