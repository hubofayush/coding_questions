import java.util.Arrays;

public class SelectionSort {
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int first = arr[i];
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < first) {
                    int temp = arr[j];
                    arr[j] = first;
                    first = temp;
                }
            }
            arr[i] = first;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 4 };
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
