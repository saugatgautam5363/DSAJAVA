package DSA.Linklist;

public class Example2 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFrist(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }
    public  void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void prinLis(){
        if(head == null){
            System.out.println("list is empty!!!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        Example2 list = new Example2();
        list.addFrist("A");
        list.prinLis();
        list.addLast("B");
        list.prinLis();
    }
}
