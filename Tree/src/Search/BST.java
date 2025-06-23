package Search;

    class Node4{
        int data;
        Node4 left;
        Node4 right;

        Node4(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public class BST {
        Node4 root;

        Node4 insert(Node4 root,int data){
            if (root == null) return new Node4(data);
            if(data < root.data){
                root.left = insert(root.left,data);
            } else if (data > root.data) {
                root.right = insert(root.right,data);
            }
                return root;
        }
        void inorder(Node4 node){
            if(node!= null){
                inorder(node.left);
                System.out.println(node.data+" ");
                inorder(node.right);
            }
        }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {12, 19, 5, 2, 7, 21, 8, 21, 12};

        for(int val : values){
            tree.root = tree.insert(tree.root,val);
        }
        System.out.println("In-order Traversal of BST:");
        tree.inorder(tree.root);
    }
}