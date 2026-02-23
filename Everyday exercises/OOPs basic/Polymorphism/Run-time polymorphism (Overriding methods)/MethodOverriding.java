public class MethodOverriding {
    public static void main(String[] args) {
        B subobj = new B (1,2,3);
        subobj.display();// this call display()
    }
}
class A{
    int i, j;
    A(int n1, int n2){
        this.i = n1;
        this.j = n2;
    }
    public void display(){
        System.out.println("i : "+i+" j : "+j);
    }
}
class B extends A{
    int k;
    B(int n1, int n2, int n3){
        super(n1,n2);
        this.k = n3;
    }
    @Override
    public void display(){
        System.out.println(" k : "+k);
    }
}