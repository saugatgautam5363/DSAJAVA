package DSA.Linklist;

public class SameExample {
    Node head;
    class Node{
        String data;
        Node next;
       public Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFrist(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode.next = currNode;
        }
        currNode.next = currNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty!!");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.data+ " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        SameExample list = new SameExample();
        list.addFrist("A");
        list.addFrist("B");
        list.addLast("C");
        list.printList();
    }
}
