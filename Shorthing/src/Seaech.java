import java.util.Scanner;

public class Seaech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5};

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(target + " not found in the array.");
        }

        scanner.close();
    }
}
