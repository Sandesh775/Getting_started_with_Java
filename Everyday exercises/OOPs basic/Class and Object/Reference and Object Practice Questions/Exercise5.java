//Exercise 5: Object Containing Its Own Type
//Create a class Node with value and next fields (where next is a reference to another Node).
// Create three Node objects with values 10, 20, and 30.
// Connect them in order: first points to second, second points to third. Now answer these questions:
//        •	How do you access the value of the first node?
//        •	How do you access the value of the second node using the first node?
//        •	How do you access the value of the third node using the first node?
//        •	What does trying to access the next of the third node give you?
public class Exercise5 {
    public static void main(String[] args) {
        Node1 n1 = new Node1();
        n1.value = 10;
        Node1 n2 = new Node1();
        n1.next = n2;
        n2.value = 20;
        Node1 n3 = new Node1();
        n2.next = n3;
        n3.value = 30;
        System.out.println("n1 -> n2 -> n3");
        System.out.println("Access the value of the first node");
        System.out.println(n1.value);
        System.out.println("Access the value of the second node using the first node");
        System.out.println(n1.next.value);
        System.out.println("Access the value of the third node using the first node");
        System.out.println(n1.next.next.value);
        System.out.println("Trying to access the next of the third node");
        System.out.println(n1.next.next.next);// null
    }
}
class Node1{
    int value;
    Node1 next;// by default points to the null object
}