package DSA.Linklist;

public class SinglyListExample {
    Node4 head;
    private int size;
     static class Node4 {
         Node4 next;
        int data;
        Node4(int data) {

            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data) {
        Node4 newNode = new Node4(data);
            newNode.next = head;
            head = newNode;
            size++;
    }
    public void addLast(int data){
        Node4 newNode = new Node4(data);
        if(head == null){
            addfirst(data);
            return;
        }
        size++;
        Node4 currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!!");
            return;
        }
        Node4 lastNode = head;

        while(lastNode.next.next!= null){
            lastNode = lastNode.next;
        }
        lastNode.next = null;
        size--;

    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty❗❗");
            return;
        }
        Node4 currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void Insert(int data, int index){
        if(index < 1 || index>size+1){
            System.out.println("Invalid Index!!");
            return;
        }
        Node4 newNode = new Node4(data);
        if(index == 1){
            addfirst(data);
            return;
        }
        Node4 temp = head;
        for(int i = 1;i<index-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    public void deletePosition(int position){
        if(position<1 || position>size){
            System.out.println("Envalid size!!!");
            return;
        }

        if(position == 1){
            deleteFirst();
        }
        Node4 temp = head;
        for(int i = 1;i<position-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public boolean search(int key){
        Node4 temp = head;

        while(temp != null){
            if(temp.data == key){
                return  true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int getsize(){
        return size;
    }
    public void reverseList(){
         if(head == null||head.next == null){
             return;
         }
         Node4 currNode = head;
         Node4 prvNode = null;
         Node4 next = null;

         while (currNode != null){
             next = currNode.next;
             currNode.next = prvNode;

             prvNode = currNode;
             currNode = next;
         }
         head = prvNode;
    }
    public static void main(String[] args) {
        SinglyListExample list = new SinglyListExample();
        list.addfirst(6);
        list.printList();
        list.addLast(7);
        list.printList();
        list.deleteLast();
        list.printList();
        list.Insert(4, 1);
        list.printList();
        list.addLast(7);
        list.printList();
        list.Insert(5, 0);
        ;list.printList();
        list.deletePosition(3);
        list.printList();
        System.out.println("Element: "+list.search(4));
        System.out.println("Size: "+list.getsize());
        list.reverseList();
        list.printList();
    }
}