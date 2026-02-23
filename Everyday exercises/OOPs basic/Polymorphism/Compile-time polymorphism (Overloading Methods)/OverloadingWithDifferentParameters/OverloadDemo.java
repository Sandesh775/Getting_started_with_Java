public class OverloadDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();
        // call all version of add()
        obj.add();
        obj.add(5,6);
        obj.add(5,6,7);
    }
}
class  Overload{
    void add(){
        System.out.println("No parameters !");
    }
    public int add (int a, int b){
        return a+b;
    }
    public int add ( int a, int b, int c){
        return a+b+c;
    }

}