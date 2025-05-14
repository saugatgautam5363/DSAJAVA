public class P {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    P() {
        root = null;
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        P p = new P();
        p.root = p.new Node(6);
        p.root.left = p.new Node(2);
        p.root.right = p.new Node(3);
        p.root.left.left = p.new Node(5);
        p.root.left.right = p.new Node(9);

        System.out.print("Inorder: ");
        p.inorder(p.root);
        System.out.println();

        System.out.print("Preorder: ");
        p.preorder(p.root);
        System.out.println();

        System.out.print("Postorder: ");
        p.postorder(p.root);
        System.out.println();
    }
}
