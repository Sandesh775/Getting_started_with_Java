//Exercise 4: Null Reference
//Create a class Node with data and next fields. Create a Node object with data 10.
//Create a second reference variable that points to the same node. Set the second reference to null.
//Can you still access the data of the first node? What happens if you try to access the data through
//the second reference after setting it to null?
public class Exercise4 {
    public static void main(String[] args) {
        Node obj = new Node();
        obj.data = 10;
        Node ref;
        ref = obj;// reference variable that points to the same node or reference variable obj
        System.out.println("Ref variable accessing obj data before setting ref to null : "+ref.data);
        ref = null;
        System.out.println("Ref variable accessing obj data after setting ref to null : "+ref.data);
    }
}
class Node{
    int data;
    Node next;
}
// it throws null pointer exception because now after setting ref to null it is not pointing to
// any object anymore