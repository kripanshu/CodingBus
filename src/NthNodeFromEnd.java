public class NthNodeFromEnd {
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

    public static void reverseList(){

        Node prev = null;
        Node current = head;
        Node next_node = null;

        while(current != null){
//            System.out.print("current node "+current.value);
            next_node = current.next;
            current.next = prev;
            prev = current;
            current = next_node;

        }
        head = prev;

    }

    public static Node nthNodeFromEnd(int pos){

            reverseList();
            Node temp = head;
            int count = 0;
            if(head == null) return null;

            while(temp!= null && count!=pos){
//                System.out.println("went past "+temp.value);
                temp= temp.next;
                count++;
            }


            return temp;

    }
    public static Node nthNodeFromEndNoReverse(int pos){

        Node temp = head;
        Node temp1 = getPosNode(pos).next;

        while(temp != null && temp1 !=null){
            temp = temp.next;
            temp1 = temp1.next;
        }
        return temp;
    }

    private static Node getPosNode(int pos) {
        Node temp = head;
        int count = 1;
        while(temp != null && count != pos){
            temp = temp.next;
            count ++;
        }

        return temp;
    }

    public static void main(String [] args){

//        NthNodeFromEnd obj = new NthNodeFromEnd();
        head = new Node(2);
        insertNew(3);
        insertNew(4);
        insertNew(5);
        insertNew(1);

        displayList(head);
//        reverseList();
        System.out.println();
//        displayList(head);
//        System.out.println(nthNodeFromEnd(3).value);
        System.out.println("get position 3 = "+ getPosNode(2).value );
        System.out.println(nthNodeFromEndNoReverse(2).value);
    }
}
