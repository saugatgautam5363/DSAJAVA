package DSA.Stack;

public class UsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public void insertBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            insertBottom(data);
            push(top);
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(4);
        stack.push(1);

        System.out.println("Original Stack:");
        stack.print();

        stack.insertBottom(0);

        System.out.println("After Inserting at Bottom:");
        stack.print();
    }
}
