public class Short {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Before Sorting:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j;

            for (j = i - 1; (j >= 0) && (arr[j] > key); j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

        System.out.println("After Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
