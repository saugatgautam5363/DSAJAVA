package DSA.Linklist;
class P{
    Node head;
    private int size;
    P(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addfirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public  void LastAdd(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        Node currNOde = head;
        while (currNOde.next != null){
            currNOde = currNOde.next;
        }
        currNOde.next = newNode;
    }
    public void pintList(){
        if(head == null){
            System.out.println("Stack is empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public  void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        size--;
        head = head.next;
    }
    public  void deleteLast(){
        if(head == null){
            System.out.println("List is empty!!!");
            return;
        }
        size--;
        if(head.next == null){
            System.out.println("List is empty!!!!");
            return;
        }
        Node secondLastNode = head;
        while (secondLastNode.next.next != null){
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }


    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        P list = new P();
        list.addfirst("B");
        list.pintList();
        list.LastAdd("C");
        list.pintList();
        list.deleteFirst();
        list.pintList();
        list.deleteFirst();
        list.pintList();
        System.out.println("List size: "+list.getSize());
    }
}