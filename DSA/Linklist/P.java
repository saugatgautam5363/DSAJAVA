package DSA.Linklist;

public class P {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public  void deleteFrist(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!!!!");
            return;
        }
        if(head.next == null){
            System.out.println("List is empty!!");
            return;
        }
        Node secondLastNode = head;
        while(secondLastNode.next.next != null){
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }
    public static void main(String[] args) {
        P list = new P();
        list.addFirst("A");
        list.printList();
        list.addFirst("B");
        list.printList();
        list.addLast("C");
        list.printList();
        list.deleteFrist();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}
