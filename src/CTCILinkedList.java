import java.util.HashMap;

public class CTCILinkedList {
//    This is  a list of problems in Cracking the coding interview
   static Node head;
static class Node{

        Node next = null;
        int value = 0;

    public Node(int i) {
        value = i;
        next = null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
    public static void removeDuplicate(Node head){
        Node temp = head;
        Node prev = null;
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();

        while(temp != null){
            if(hmap.containsKey(temp.value) && temp.next != null){
//                System.out.println(" there is already a key "+ temp.value);
                prev.next = temp.next;
                temp = temp.next;
            }
            else {
//                System.out.println(" there is new a key "+ temp.value);
                hmap.put(temp.value,1);
                prev = temp;
                temp = temp.next;

            }


        }

    }
    public static void deleteMiddleNode(){
    Node prev = null;
    Node slow = head;
    Node fast = slow.next.next;
     while(slow.next !=null && fast.next != null){
         prev = slow;
         slow = slow.next;
         fast = fast.next;
     }
     prev.next = slow.next;

    }
    public static void insertNew(int val){

        Node temp = head;

        Node fresh = new Node(val);

        if(temp == null){
            head = fresh;
        }

        while(temp.next != null){

            temp = temp.next;

        }

        temp.next = fresh;


    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");

            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        head = new Node(1);
        insertNew(2);
        insertNew(3);
        insertNew(4);
        insertNew(2);
        insertNew(4);
        insertNew(5);
        insertNew(6);



        display(head);
        removeDuplicate(head);
        display(head);
        deleteMiddleNode();
        display(head);



    }

}
