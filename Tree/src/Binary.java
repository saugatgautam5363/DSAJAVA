public class Binary {
    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    Binary(){
        root = null;
    }
    void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data+" ");
        inorder(node.right);
    }
    void postorder(Node node){
        if(node ==  null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+" ");
    }
    void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Binary node =  new Binary();
        node.root = node.new Node(4);
        node.root.left = node.new Node(5);
        node.root.right = node.new Node(7);
        node.root.left.left = node.new Node(9);
        node.root.left.right = node.new Node(7);

        System.out.print("Inorder traversal: ");
        node.inorder(node.root);

        System.out.print("\nPreorder traversal: ");
        node.preorder(node.root);

        System.out.print("\nPostorder traversal: ");
        node.postorder(node.root);
    }
}
