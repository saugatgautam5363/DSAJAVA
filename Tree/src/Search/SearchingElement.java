package Search;
class Node0{
    int data;
    Node0 left,right;

    Node0(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class SearchingElement {
    Node0 root;

    boolean Search(Node0 node, int data){
        if( node == null){
            return false;
        }
        if(data == node.data){
            return true;
        }
        if(data< node.data){
            return Search(node.left,data);
        } else {
            return Search(node.right,data);
        }
    }

    public static void main(String[] args) {
        SearchingElement tree = new SearchingElement();
        int[] values = {1,4,3,5,6,4,3,3,3,5,6};

        for(int val : values){
        }
    }
}
