package DSA.Linklist;
class List{
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
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
public  void printList(){
        if(head == null){
            System.out.println("List is empty!!!!");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
    System.out.println("NULL");
}
public void deletedFirst(){
        if(head == null){
            System.out.println("list is empty!!!");
            return;
        }
          head =  head.next;
}
public void deleteLast(){
        if(head == null){
            System.out.println("Stack is empty!!!");
            return;
        }
        if(head.next == null){
            head = null;
        }
        Node SecondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            SecondLast = SecondLast.next;
        }
        SecondLast.next = null;
}
    public static void main(String[] args) {
        List list = new List();
        list.addFirst("A");
        list.printList();
        list.addFirst("B");
        list.printList();
        list.addLast("C");
        list.printList();
        list.deletedFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}