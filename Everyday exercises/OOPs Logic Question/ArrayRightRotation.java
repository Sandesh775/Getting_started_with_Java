import java.util.Arrays;

public class ArrayRightRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] rotated = rightRotateSimple(arr, k);

        System.out.println("After right rotation by " + k + ": " + Arrays.toString(rotated));
    }

    public static int[] rightRotateSimple(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle k > n, set between 0 - n length boundary

        int[] result = new int[n];

        // Copy last k elements to front
        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];
        }

        // Copy remaining elements
        for (int i = k; i < n; i++) {
            result[i] = arr[i - k];
        }

        return result;
    }
}