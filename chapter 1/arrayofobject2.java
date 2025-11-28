
class arrayofobject2{
    public static void main(String a[]){
        // we should manually create object first
        book b1 = new book();
        b1.id = 1000;
        b1.title = "Hello world";
        b1.price = 250;

        book b2 = new book();
        b2.id = 1001;
        b2.title = "Hello world2";
        b2.price = 300;

        book b3 = new book();
        b3.id = 1002;
        b3.title = "Hello world3";
        b3.price = 500;
        
        book store [] = new book[3];
        store[0] = b1;
        store[1] = b2;
        store[2] = b3;

        for ( int i = 0;i<store.length;i++){
            if(store[i].price>250){
                System.out.println("Book id : "+store[i].id+"title : "+store[i].title+"price : "+store[i].price);
            }
        }
    }
}
class book{
    int id;
    String title;
    int price;
}