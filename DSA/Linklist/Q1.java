package DSA.Linklist;

public class Q1 {
    Node5 head;
    static class Node5{
        int data;
        Node5 next;

        Node5(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int position,int data){
        Node5 newNode = new Node5(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node5 currNode = head;
        for(int i = 1;i<position-1;i++){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
public void printList(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        Node5 temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Q1 list = new Q1();
        list.insert(1,8);
        list.printList();
    }
}
