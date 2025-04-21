package DSA.Stack;

public class TowStack {
    public static class Stack {
        int top1;
        int top2;
        int[] arr;
        int size;

        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top1 = -1;
            top2 = size;
        }

        public void push1(int data) {
            if (top1 < top2 - 1) {
                arr[++top1] = data;
            } else {
                System.out.println("Stack Overflow on Stack1");
            }
        }

        public void push2(int data) {
            if (top1 < top2 - 1) {
                arr[--top2] = data;
            } else {
                System.out.println("Stack Overflow on Stack2");
            }
        }

        public int pop1() {
            if (top1 >= 0) {
                return arr[top1--];
            } else {
                System.out.println("Stack Underflow on Stack1");
                return -1;
            }
        }

        public int pop2() {
            if (top2 < size) {
                return arr[top2++];
            } else {
                System.out.println("Stack Underflow on Stack2");
                return -1;
            }
        }

        public void print() {
            System.out.print("\nStack1: ");
            for (int i = 0; i <= top1; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.print("\nStack2: ");
            for (int i = size - 1; i >= top2; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push1(4);
        stack.push2(9);
        stack.push2(0);
        stack.push1(8);

        stack.print();

        System.out.println("Pop Stack1: " + stack.pop1());
        System.out.println("Pop Stack2: " + stack.pop2());

        stack.print();
    }
}
