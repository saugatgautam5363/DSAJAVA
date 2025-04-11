
package DSA.Stack;

class Stack {
    private int top;
    private int maxSize;
    private String[] stackArray;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[size];
        this.top = -1;  
    }

    public void push(String value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5); 
        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.printStack(); 

        String element = stack.pop();
        System.out.println("Pop: " + element);

        String topElement = stack.peek();
        System.out.println("Peek: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        System.out.println("Size: " + stack.size());
    }
}
