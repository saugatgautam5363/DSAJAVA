package Search;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST2 {
    Node2 root;

    Node2 insert(Node2 node, int data) {
        if (node == null) {
            return new Node2(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    void inorder(Node2 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BST2 tree = new BST2();
        int[] values = {1, 5, 2, 9, 4, 2, 0, 4, 8};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.println("In-order Traversal:");
        tree.inorder(tree.root);
    }
}
