public class BST {

    class Node {
        Node left;
        Node right;
        int key;

        public Node(int item){
            key = item;

        }
    }

    Node root;
    //Constructor
    private void insert(int i) {
        Node node = new Node(i);
        if(root == null){
            root = node;
            return;
        }
        Node previous = null;
        Node temp = root;
        while(temp != null){
           if(temp.key < i){
               previous = temp;
              temp = temp.left;
           }else if (temp.key > i){
               previous = temp;
               temp = temp.right;
           }
        }
        if(previous.key > i){
           previous.left = node;
        }else previous.right = node;
    }


    public static void main(String[] args){
        BST tree = new BST();
        tree.insert(30);
        tree.insert(50);
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(40);
        tree.insert(60);

    }




}
