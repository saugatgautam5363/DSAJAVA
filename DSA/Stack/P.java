package DSA.Stack;

public class P {
    public static class Stack {
        int size;
        int[] arr;
        int top;

        Stack(int size){
            this.size = size;
            this.top = -1;
            this.arr = new int[size];
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public void push(char data){
            arr[++top] = data;
        }
        public char pop(){
            if(isEmpty()){
                return (char) -1;
            }
            return (char) arr[top--];
        }
    }
    public static String reverse(String str){
        Stack stack = new Stack(str.length());

        for(int i =0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String reversed = " ";
        while(!stack.isEmpty()){
            reversed+=stack.pop();
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "SAUGAT";
        String reversed = reverse(input);

        System.out.println("Original String: "+input);
        System.out.println("Reversed String: "+reversed);
    }
}