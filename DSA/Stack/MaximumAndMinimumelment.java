package DSA.Stack;

public class MaximumAndMinimumelment {
    public static  class Stack{
        int size;
        int top;
        int[] arr;

        Stack(int size){
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public  void push(int data){
            arr[++top] = data;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!!");
            }
            return arr[top--];
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty!!");
            }
            return arr[top];
        }
        public int max(){
            if(isEmpty()){
                System.out.println("Stack is empty!!");
            }
            int max = arr[0];
            for(int i =1;i<=top;i++){
                if(max < arr[i]){
                   max = arr[i];
                }
            }
            return max;
        }
        public int min(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            int min = arr[0];
            for(int i = 1;i<=top;i++){
                if(min>arr[i]){
                    min = arr[i];
                }
            }
            return min;
        }
        public void print(){
            if(isEmpty()){
                System.out.println("Stack is empty!!");
            }
            for (int i = top;i>=0;i--){
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push(56);
        stack.push(45);
        stack.push(565);
        stack.push(-3);

        stack.print();
        System.out.println("Maximum value: "+stack.max());
        System.out.println("Minimum value: "+stack.min());
    }
}
