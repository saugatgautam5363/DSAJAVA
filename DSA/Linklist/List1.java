package DSA.Linklist;
public class List1 {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void firstAdd(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {  // Fixing the while loop
            currNode = currNode.next;
        }
        currNode.next = newNode;  // Fixing node assignment
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!!!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLastNode = head;
        while (secondLastNode.next.next != null) {
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public static void main(String[] args) {
        List1 list = new List1();
        list.firstAdd("A");
        list.firstAdd("B");
        list.printList();
        list.addLast("C");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}
