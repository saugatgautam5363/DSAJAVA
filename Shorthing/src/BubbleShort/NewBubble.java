package BubbleShort;

public class NewBubble {
    public static void print(int arr[]){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,8,4,3,8,1,6};

        for(int i = 0;i< arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }
}
