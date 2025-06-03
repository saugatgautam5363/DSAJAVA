package SelectionSort;

public class Selection {
    public static void selection(int arr[]){

        for(int i = 0;i< arr.length;i++){
            int min = i;

            for(int j =i+1;j< arr.length;j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }


    }
    public static void printArray(int arr[]){
        for(int num: arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,2,8,0,3};
        System.out.println("Original Array: ");
        printArray(arr);
        selection(arr);
        System.out.println("\nSorted Array: ");
        printArray(arr);
    }
}
