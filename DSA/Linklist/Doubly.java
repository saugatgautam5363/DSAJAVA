package DSA.Linklist;

public class Doubly {
    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class DoublyLinkedList {
        Node head;

        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        public void deleteNode(int data) {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node temp = head;
            if (temp.data == data) {  // If head node needs to be deleted
                head = temp.next;
                if (head != null) {
                    head.prev = null;
                }
                return;
            }

            while (temp != null && temp.data != data) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Element not found.");
                return;
            }

            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }

            if (temp.prev != null) {
                temp.prev.next = temp.next;
            }
        }

        public void displayForward() {
            Node temp = head;
            System.out.print("Doubly Linked List (Forward): ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void displayBackward() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.print("Doubly Linked List (Backward): ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Doubly doubly = new Doubly();
        DoublyLinkedList dll = doubly.new DoublyLinkedList();

        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtBeginning(5);
        dll.insertAtBeginning(1);

        dll.displayForward();
        dll.displayBackward();

        dll.deleteNode(10);
        dll.displayForward();
    }
}
