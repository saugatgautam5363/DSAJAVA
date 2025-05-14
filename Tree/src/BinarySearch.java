public class BinarySearch {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node Insert(Node node, int key){
        if(node == null){
            return new Node(key);
        }
        if(key < node.data){
            node.left = Insert(node.left, key);
        }
        if(key > node.data){
            node.right = Insert(node.right,key);
        }
        return node;
    }
    boolean search(Node node,int data){
        if(node== null){
            return false;
        }
        if(data == node.data){
            return true;
        }
        return data < node.data ? search(node.left,data) : search(node.right,data);
    }
}
