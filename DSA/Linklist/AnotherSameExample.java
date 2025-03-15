package DSA.Linklist;

public class AnotherSameExample {
    Node1 head;
    private int size;

    static class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public  void addFirst(int data){
        Node1 newNode = new Node1(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(int data){
        if(head == null){
            addFirst(data);
        }
        Node1 newNode = new Node1(data);
        Node1 currNode = head;
        while (currNode.next!= null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }
    public void Insert(int data, int position) {
        Node1 newNode = new Node1(data);

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position!!");
            return;
        }

        if (position == 1) {
            addFirst(data);
            return;
        }

        Node1 currNode = head;

        for (int i = 1; i < position - 1; i++) {
            if (currNode == null) {
                System.out.println("Invalid position!!");
                return;
            }
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;

        size++;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node1 newNode = head;
        while (newNode != null){
            System.out.print(newNode.data+" -> ");
            newNode = newNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        AnotherSameExample list = new AnotherSameExample();
        list.addFirst(9);
        list.addLast(0);
        list.printList();
        list.Insert(4,1);
        list.printList();
        list.Insert(5,2);
        list.printList();
    }
}

