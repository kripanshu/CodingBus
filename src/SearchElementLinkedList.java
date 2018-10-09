public class SearchElementLinkedList {
    static Node head;
    static class Node {

        Node next;
        int value;

        Node(int i) {
            next = null;
            value = i;
        }

        public Node getNode(Node node){return node;};


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

    public static void displayList(Node root){

        if(root == null){
            System.out.println("No List to Display");
        }

        while(root != null){
            System.out.print(root.value + " -> ");
            root= root.next;
        }
        System.out.print("null");

    }
    public static int searchNode(int val){
        Node temp = head;
        System.out.print("input val"+val);
        if(temp == null) return 0;
        if(temp.value == val) return temp.value;
        while(temp != null && temp.value != val){
            temp = temp.next;
            System.out.print("passed val"+ temp.value);
        }

        return temp.value;
    }

    public static void main (String [] args){

        SearchElementLinkedList obj = new SearchElementLinkedList();
        obj.head = new Node(5);
        insertNew(6);
        insertNew(7);
        insertNew(8);
        insertNew(9);
        insertNew(10);




        displayList(head);
        System.out.println(searchNode(8));



    }
}
