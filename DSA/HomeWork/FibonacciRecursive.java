package DSA.HomeWork;

public class FibonacciRecursive {

    public static int fibnnacci(int n){
        if(n <= 1){
            return n;
        }
        return fibnnacci(n-1)+ fibnnacci(n -2);
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0;i< n;i++){
            System.out.println(fibnnacci(i) + " ");
        }
    }
}
