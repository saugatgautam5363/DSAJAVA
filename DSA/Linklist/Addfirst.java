package DSA.Linklist;

public class Addfirst {
    Node0 head;
    int size;
    class Node0{
        int data;
        Node0 next;
        Node0(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFrist(int data){
        Node0 newNode = new Node0(data);
       newNode.next = head;
       head = newNode;
       size++;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        if(head.next == null){
            head.next = head;
        }
        Node0 secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    public void deletePosition(int position){
        if(position<1 && position> size){
            System.out.println("Envalid size!!!");
            return;
        }

        Node0 temp = head;
        for(int i=1;i<position-1;i++){
            temp.next = temp;
        }
        if(head.next == null){
            System.out.println("List cannot delete position");
            return;
        }
        temp.next = temp.next.next;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        Node0 newNode = head;
        while (newNode != null){
            System.out.print(newNode.data+" -> ");
            newNode = newNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Addfirst list = new Addfirst();
        list.addFrist(5);
        list.printList();
        list.addFrist(9);
        list.printList();
        list.deleteLast();
        list.printList();
        list.deletePosition(1);
        list.printList();
    }

}
