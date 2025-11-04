import java.util.*;

public class BinSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n < 0 || n > 100) {
            System.out.println("Invalid Size");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        if (n > 0) {
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        Arrays.sort(arr);
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int ans = binarySearch(arr, target);
        if (ans != -1) {
            System.out.println("Found at index " + ans);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
