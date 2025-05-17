package Search;
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
public class Search {
    public static Node insert(Node node, int data){
        if(node == null){
            return  new Node(data);
        }
        if(data< node.data ){
            node.left = insert(node.left,data);
        }
        if(data>node.data){
            node.right = insert(node.left,data);
        }
        return node;
    }

    boolean search(Node node,int data){
        if(node == null){
            return false;
        }
        if(node.data == data){
            return true;
        }
        return (node.data<data) ? search(node.left,data) : search(node.right,data);
    }

}
