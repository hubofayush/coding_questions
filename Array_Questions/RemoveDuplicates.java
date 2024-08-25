import java.util.HashMap;

public class RemoveDuplicates {
    public static void removeDuplicates(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!ans.containsKey(arr[i])) {
                ans.put(arr[i], 1);
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 3, 4, 4 };
        removeDuplicates(arr);
        // System.out.println(Arrays.toString(arr));
    }
}
