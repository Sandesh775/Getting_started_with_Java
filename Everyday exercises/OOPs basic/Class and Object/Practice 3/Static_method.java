public class Static_method {
    public static void main(String[] args) {
        display();
    }
    static void display(){// inside static method you can't call non-static method
        Static_method obj = new Static_method();// but we can only using reference variable
        obj.hello();
    }
    void hello(){// but we can call static method inside non-static one
        System.out.println("Hello there !");
        display();// look we can call static method inside non-static one
    }
    void fun(){
        hello();// and obviously non-static can call non-static method !
    }
}
