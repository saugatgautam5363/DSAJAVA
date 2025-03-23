package DSA.Linklist;

public class Reverse {
    NodeR head;
    static class NodeR{
        int data;
        NodeR next;


        NodeR(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void linkListReverse(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        NodeR prevNode = null;
        NodeR current = head;
        NodeR next = null;
        while(current !=null){
            next = current.next;
            current.next = prevNode;
            prevNode = current;
            current = next;
        }
        head = prevNode;
    }
    public void addfirst(int data){
        NodeR newNode = new NodeR(data);
        newNode.next = head;
        head = newNode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        NodeR temp = head;
        while (temp !=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.addfirst(4);
        list.addfirst(9);
        list.addfirst(8);
        list.printlist();
        list.linkListReverse();
        list.printlist();
    }
}
