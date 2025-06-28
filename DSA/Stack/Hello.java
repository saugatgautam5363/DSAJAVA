package DSA.Stack;

public class Hello {
    static class Stack{
        int size;
        int top;
        int[] arr;
        Stack(int size){
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }

        boolean isEmpty(){
            return top == -1;
        }
        boolean isFull(){
            return top == size-1;
        }

        void push(int data){
            if(isFull()){
                System.out.println("Stack is full cannot push the value");
                return;
            }
            arr[++top] = data;
//            System.out.println("Stack push value: "+data);
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty cannot push the value of stack");
            }
            int popValue = arr[--top];
            return popValue;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            return arr[top];
        }
        void display(){
            if(isEmpty()){
                System.out.println("Stack is empty!!");
            }
            for(int i = top;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(4);
        stack.push(4);
        stack.push(0);
        stack.push(6);
        stack.push(9);
//        stack.pop();
        System.out.println("stack top element: "+stack.peek());

        stack.display();
    }
}
