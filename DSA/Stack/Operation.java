package DSA.Stack;

public class Operation {
    public static class Stack{
         int top;
        int size;
        int[] arr;

        Stack(int size){
            this.top = -1;
            this.size = size;
            this.arr = new int[size];
        }
        public  boolean isEmpty(){
            return top == -1;
        }
        public boolean isFull(){
            return top == size-1;
        }
        public void push(int value){
            if(isFull()){
                System.out.println("Stack is full");
            }
            arr[++top] = value;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            return arr[--top];
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            return arr[top];
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }

            for(int i = top;i>=0;i--){
                System.out.println("Element : "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(40);
        stack.push(4);
        stack.push(3);
        stack.pop();
        stack.display();

        System.out.println("Peek element "+stack.peek());
    }
}
