package DSA.HomeWork;

import com.sun.jdi.Value;

public class Exam {
    static  class Stack{
    int top;
    int size;
    int[] arr;

    Stack(int size){
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }
     boolean isFull(){
        return top == -1;
    }
        boolean isEmpty(){
            return top == size -1;
        }

    void push(int data){
        if(isFull()){
            System.out.println("Stack is full cannot Push");
        }
        arr[++top] = data;
        System.out.println("Push: "+ data);
    }
    void delete(int data){
        if(isEmpty()){
            System.out.println("Stack is empty!!");
        }
    }

    }


}
