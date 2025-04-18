package DSA.Stack;

import static DSA.Stack.InsertBottem.Stack.insertBoottem;

public class InsertBottem {
     static class Stack {
         int top;
         int size;
         int[] arr;

         Stack(int size){
             this.size = size;
             this.top = -1;
             this.arr = new int[size];
         }
         public  boolean isEmpty(){
             return top == -1;
         }
         public void push(int value){
             arr[++top] = value;
         }
         public int pop(){
             if(isEmpty()){
                 return -1;
             }
             return arr[top--];
         }
         public void print(){
             if(isEmpty()){
                 System.out.println("Stack is empty");
                 return;
             }
             for(int i = top;i>=0;i--){
                 System.out.println(arr[i]+" ");
             }
         }
         public static void insertBoottem(Stack stack,int data){
             if(stack.isEmpty()){
                 stack.push(data);
                 return;
             }
             int top = stack.pop();
             insertBoottem(stack,data);
             stack.push(top);
         }
     }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(9);
        stack.push(0);
        System.out.println("Original Stack: ");
        stack.print();

        System.out.println("After Push the data: ");
        insertBoottem(stack,9);
        stack.print();
    }
}