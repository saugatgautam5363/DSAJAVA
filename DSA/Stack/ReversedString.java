package DSA.Stack;

public class ReversedString {

    static class Stack {
        int top = -1;
        char[] arr;

        Stack(int size) {
            arr = new char[size];
        }

        void push(char ch) {
            arr[++top] = ch;
        }

        char pop() {
            return arr[top--];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }
    public static String reverse(String str){
        Stack stack = new Stack(str.length());

        for(int i = 0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String reversed = "";

        while(!stack.isEmpty()){
            reversed +=stack.pop();
        }
        return reversed;
    }
    public static void main(String[] args) {
        String input = "Gautam  ";
        String reverse = reverse(input);

        System.out.println("Original String: "+input);
        System.out.println("Reversed String: "+reverse);
    }
}

