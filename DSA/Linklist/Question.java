package DSA.Linklist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
class Question{
    Node head;
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public int scarch(int target){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == target){
                return  index;
            }
            temp= temp.next;
            index ++;
        }
        return  -1;
    }

    public static void main(String[] args) {
        Question list  = new Question();
        int[] element = {1,2,3,4,5,6};
        for(int elem : element){
            list.append(elem);
        }
        int index = list.scarch(3);
        System.out.println("Target element is: "+index);
    }
}