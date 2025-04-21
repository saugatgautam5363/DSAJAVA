public class SelectionSort {
        public static void main(String[] args) {
            int[] arr = {29, 10, 14, 37, 13};
            System.out.println("Original array: ");
            for (int k : arr) {
                System.out.print(k+" ");
            }
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            System.out.print("\nAfter Short: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


