package DSA.Linklist;

public class DSAProgram {
    Node7 head;
    int size = 0;

    static public class Node7 {
        int data;
        Node7 next;
        Node7(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node7 newNode = new Node7(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void addLast(int data) {
        Node7 newList = new Node7(data);
        if (head == null) {
            head = newList;
            size++;
            return;
        }
        Node7 newNode = head;
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = newList;
        size++;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node7 second = head;
        Node7 last = head.next;
        while (last.next != null) {
            second = second.next;
            last = last.next;
        }
        second.next = null;
        size--;
    }

    public void deleteposition(int position) {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        if (position < 1 || position > size) {
            System.out.println("Position Could Not Found");
            return;
        }
        if (position == 1) {
            delete();
            return;
        }
        Node7 temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void insert(int position, int data) {
        Node7 newNode = new Node7(data);

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position!!");
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node7 temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        Node7 newNode = head;
        while (newNode != null) {
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DSAProgram list = new DSAProgram();
        list.add(20);
        list.printList();
        list.add(8);
        list.printList();
        list.delete();
        list.printList();
        list.addLast(5);
        list.printList();
        list.addLast(0);
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteposition(2);
        list.printList();
        list.insert(1, 1);
        list.printList();
        list.insert(2, 9);
        list.printList();
        System.out.println("Size " + list.getSize());
    }
}
