package DSA.Linklist;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddelNumberFind {
    // Method to get the length of the linked list
    public static int getLength(Node2 head) {
        Node2 currNode = head;
        int count = 0;
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }
        return  count;
    }
public static int middelNumber(Node2 head){
        if(head == null){
            return  -1;
        }
        Node2 fast = head;
        Node2 slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
}
    public static void main(String[] args) {
        Node2 head = new Node2(2);
        head.next = new Node2(5);
        head.next.next = new Node2(7);
        head.next.next.next = new Node2(8);

        System.out.println("List Total number of index: "+getLength(head));
        System.out.println("Middle element of the list: " + middelNumber(head));

    }
    }
