import java.util.Arrays;

public class SecondSmallestLargest {
    public static int[] secondSmallestLargest(int[] arr) {
        int[] ans = new int[2];
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
                ans[0] = secondSmallest;
            }
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > largest) {
                secondLargest = largest;
                largest = a;
            } else if (a > secondLargest && a != largest) {
                secondLargest = a;
                ans[1] = secondLargest;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2 };
        System.out.println(Arrays.toString(secondSmallestLargest(arr)));
    }
}
