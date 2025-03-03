package Stack;

class Stack {
    private int top;
    private int maxSize;
    private String[] stackArray;

    // Constructor
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[size];
        this.top = -1; // Initially, the stack is empty
    }

    // Push operation (Manually adding elements)
    public void push(String value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop operation (Manually removing elements)
    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    // Peek operation (Get the top element without removing it)
    public String peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stackArray[top];
    }

    // isEmpty operation (Check if stack is empty)
    public boolean isEmpty() {
        return top == -1;
    }

    // Size operation (Get the number of elements in the stack)
    public int size() {
        return top + 1;
    }

    // Print the stack
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
        Stack stack = new Stack(5); // Creating a stack with size 5

        // Push
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.printStack(); // Print stack

        // Pop
        String element = stack.pop();
        System.out.println("Pop: " + element);

        // Peek
        String topElement = stack.peek();
        System.out.println("Peek: " + topElement);

        // isEmpty
        boolean isEmpty = stack.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // Size
        System.out.println("Size: " + stack.size());
    }
}
