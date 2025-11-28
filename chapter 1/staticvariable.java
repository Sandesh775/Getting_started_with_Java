class mobile {
    String brand;
    int price;
    static String common_name; // making this common to all object from this class 
    // static here is belong to class not to a object 
    public void show(){
        System.out.println(brand +":"+ price +":" + common_name);
    }
}
class staticvariable{
    public static void main(String a[]){
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        obj1.common_name = "phone";// Mobile.common_name = "Smartphone";

        mobile obj2 = new mobile();
        obj2.brand = "Nokia";
        obj2.price = 1800;
        Mobile.common_name = "Smartphone";
        
        Mobile.common_name = "Phone";
        obj1.show();
        obj2.show();

    }
}