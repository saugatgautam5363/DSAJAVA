public class FirstProgram   {
    class Node{
        int key;
        Node left;
        Node right;

        Node(int key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    Node root;
    FirstProgram(){
        root = null;
    }
    void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.key+" ");
        inorder(node.right);
    }
    void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.key+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void postorder(Node node){
        if(node== null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key+" ");
    }
    public static void main(String[] args) {
        FirstProgram node = new FirstProgram();

        node.root = node.new Node(1);
        node.root.left = node.new Node(2);
        node.root.right = node.new Node(3);
        node.root.left.left = node.new Node(4);
        node.root.left.right = node.new Node(5);

        System.out.print("Inorder traversal: ");
        node.inorder(node.root);

        System.out.print("\nPreorder traversal: ");
        node.preorder(node.root);

        System.out.print("\nPostorder traversal: ");
        node.postorder(node.root);
    }
}

