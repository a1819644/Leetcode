import javax.swing.tree.TreeNode;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteLeavesWithAGivenValue {
    // Java program to delete element
// in binary tree    // A binary tree node has key, pointer to
// left child and a pointer to right child
        static class Node
        {
            int key;
            Node left, right;


            // Constructor
            Node(int key)
            {
                this.key = key;
                left = null;
                right = null;
            }
        }

        static Node root;
        static Node temp = root;


        // Driver code
        public static void main(String[] args)
        {
            root = new Node(10);
            root.left = new Node(11);
            root.left.left = new Node(7);
            root.left.right = new Node(12);
            root.right = new Node(9);
            root.right.left = new Node(15);
            root.right.right = new Node(8);



        }


}
