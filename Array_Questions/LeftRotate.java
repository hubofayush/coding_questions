import java.util.Arrays;

public class LeftRotate {
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        RightRotate.reverse(arr, 0, k - 1);
        RightRotate.reverse(arr, k, n - 1);
        RightRotate.reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        leftRotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
