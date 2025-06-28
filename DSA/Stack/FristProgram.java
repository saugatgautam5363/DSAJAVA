package DSA.Stack;

public class FristProgram {

    static class Stack {
        int top;
        int size;
        int[] arr;

        Stack(int size) {
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == size - 1;
        }

        void push(int value) {
            if (isFull()) {
                System.out.println("Stack Overflow!! Cannot push " + value);
                return;
            }
            arr[++top] = value;
            System.out.println("Pushed: " + value);
        }
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!! Cannot pop");
                return -1;
            }
            int popped = arr[top--];
            System.out.println("Popped: " + popped);
            return popped;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            return arr[top];
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!");
                return;
            }
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(8);
        stack.push(4);
        stack.push(2);
        stack.push(10);

        stack.display();

        System.out.println("Peek element: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
    }
}