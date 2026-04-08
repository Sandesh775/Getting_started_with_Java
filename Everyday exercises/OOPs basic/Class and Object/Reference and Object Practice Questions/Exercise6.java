
//Exercise 6: Traversal Through References
//Create a chain of four nodes with values 5, 15, 25, and 35.
// Use a reference variable head to point to the first node. Now write in your mind the steps to:
//•	Traverse through all nodes without using a loop (just by manually following the chain)
//•	Calculate the sum of all values
//•	Count how many nodes exist
//What is the pattern of how you move from one node to the next?

public class Exercise6 {
    public static void main(String[] args) {
        LinkedList head;
        LinkedList n1 = new LinkedList(5);
        LinkedList n2 = new LinkedList(15);
        LinkedList n3 = new LinkedList(25);
        LinkedList n4 = new LinkedList(35);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        head = n1;// head pointer pointing to the first node
        int sum = 0;
        int countNodes = 0;
        System.out.println("Traverse through all nodes without using a loop (just by manually following the chain)");
        sum = n1.value+ n1.next.value+ n1.next.next.value + n1.next.next.next.value;
        //sum = n1.value+ n2.value+ n3.value + n4.value;
        if(n1 != null){
            countNodes++;
        }
        if(n1.next != null){
            countNodes++;
        }
        if(n1.next.next != null){
            countNodes++;
        }
        if(n1.next.next.next != null){
            countNodes++;
        }
        if(n1.next.next.next.next != null){
            countNodes++;
        }
//        if(n1 != null){
//            countNodes++;
//        }
//        if(n2!= null){
//            countNodes++;
//        }
//        if(n3!= null){
//            countNodes++;
//        }
//        if(n4!= null){
//            countNodes++;
//        }
        System.out.println("Total sum of values of all nodes is "+sum);
        System.out.println("Total count of all nodes in Linked list is "+countNodes);
    }
}
class LinkedList{
    LinkedList(int value){
        this.value = value;
    }
//    LinkedList(int value, LinkedList node){
//        this.value = value;
//        this.next = node;
//    }
    int value;
    LinkedList next;
}