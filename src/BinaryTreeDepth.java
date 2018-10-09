
class Node{
    int key;
    Node left, right;

   public Node(int val){
        left = right = null;
        key = val;

    }


        }



public class BinaryTreeDepth {

    Node root;

    int maxDepth(Node root){
        int depth = 0;

        if ( root == null){
            return 0;
        }
        else {

            return 1 +  Math.max(maxDepth(root.left),maxDepth(root.right));

        }

    }

    public static void main(String args[]){

        BinaryTreeDepth instance_obj = new BinaryTreeDepth();
        instance_obj.root = new Node(3);
        instance_obj.root.left = new Node(9);
        instance_obj.root.right = new Node(20);
        instance_obj.root.right.left = new Node(15);
        instance_obj.root.right.right = new Node(7);

        System.out.println(instance_obj.maxDepth(instance_obj.root));

    }
}
