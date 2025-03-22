package DSA.Linklist;
public class LeedcodeProblem {
    NodeList head;  // This should refer to a NodeList object
    int position;

    // Constructor for LeedcodeProblem
    public LeedcodeProblem(int position) {
        this.position = position;
    }

    // Definition of NodeList class (you need this for head)
    static class NodeList {
        int data;  // Example data field
        NodeList next;  // Reference to the next node

        // Constructor for NodeList
        NodeList(int data) {
            this.data = data;
            this.next = null;  // Next node is initially null
        }
    }

    public static void main(String[] args) {
        // Example of creating an object of LeedcodeProblem with a position
        LeedcodeProblem problem = new LeedcodeProblem(1);

        // Example of creating a NodeList (linked list node) with some data
        NodeList node = new NodeList(0);

        // Link the node
        problem.head = node;

        // Print out the data in the first node
        System.out.println("Node data: " + problem.head.data);
    }
}

