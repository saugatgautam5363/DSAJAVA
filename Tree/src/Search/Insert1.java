package Search;

class Node8 {
    int data;
    Node8 left, right;

    Node8(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Insert1 {
    Node8 root;

    // Insert a new node
    Node8 insert(Node8 node, int data) {
        if (node == null) {
            return new Node8(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    // In-order traversal
    void inorder(Node8 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        Insert1 tree = new Insert1();
        int[] values = {1, 3, 5, 7, 0, 2};

        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("In-order Traversal: ");
        tree.inorder(tree.root);
    }
}
