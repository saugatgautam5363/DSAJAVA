package DSA.Stack;

import javax.swing.text.Element;

public class Other {
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

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;

            return top;
        }
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(96);
        stack.push(49);
        stack.push(58);

        while (!stack.isEmpty()) {
            System.out.println("Element: " + stack.peek());
            stack.pop();
        }
    }
}