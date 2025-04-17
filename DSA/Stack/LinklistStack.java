package DSA.Stack;

public class LinklistStack {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            return head.data;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(55);
        stack.push(765);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println("Top: " + stack.peek());
            stack.pop();
        }
    }
}
