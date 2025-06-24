package DSA.Linklist;
public class DeletePosition {
    Node3 head;
     private int size;
     static class Node3{
        int data;
        Node3 next;


        Node3(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data) {
        Node3 newNode = new Node3(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public void addLast(int data){
        Node3 newNode = new Node3(data);
        if(head == null){
            head = newNode;
            return;
        }
        size++;
        Node3 currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }
    public void deletefirst(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
        }
        Node3 secondLast = head;
        Node3 last = head.next;

        while(last.next != null){
            last = last.next;
           secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node3 node = head;
        while(node != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println("NULL");
    }
    public void deletePosition(int position) {
         if(position<1 && position>size){
             System.out.println("Invalid position!!");
             return;
         }

         if(position == 1){
             deletefirst();
             return;
         }
         Node3 temp = head;
         for(int i = 0;i<position-1;i++){
             temp = temp.next;
         }
         if(head.next == null){
             System.out.println("Node is Not delete position...");
             return;
         }
         temp.next = temp.next.next;
    }
    public boolean search(int key){
         Node3 temp = head;
         while(temp != null){
             if(temp.data == key){
                 return true;
             }
             temp = temp.next;
         }
         return false;
    }
    public void pushspecificposition(int data,int position){
         if(position<1 || position>size+1){
             System.out.println("Invalid size!!");
             return;
         }
         Node3 newNode = new Node3(data);
         if(position == 1){
           newNode.next = head;
           head = newNode;
           size++;
           return;
         }else {
         Node3 temp = head;
             for(int i = 1;i<position-1;i++){
                 temp = temp.next;
             }
             newNode.next = temp.next;
             temp.next = newNode;
         }
         size++;



    }


    public static void main(String[] args) {
        DeletePosition list = new DeletePosition();
        list.addLast(5);
        list.addLast(7);
        list.addLast(9);
        list.printList();
        list.addLast(7);
        list.printList();
        list.deletefirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deletePosition(1);
        list.printList();
        System.out.println("Search: "+list.search(9));
        list.pushspecificposition(7,1);
        list.printList();
        list.pushspecificposition(3,2);
        list.printList();

    }
}
