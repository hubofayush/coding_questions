import java.util.Arrays;

public class IncreasingDecreasing {
    public static void increasingDecreasing(int[] arr) {
        sortArray(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < index) {
                    int temp = arr[j];
                    arr[j] = index;
                    index = temp;
                }
            }
            arr[i] = index;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 2, 5, 3, 4, 7 };
        increasingDecreasing(arr);
    }
}
