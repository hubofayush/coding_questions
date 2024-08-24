public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 24, 11, 2, 3, 34, 122, 331, 3434 };
        System.out.println(largestNumArray(arr));
    }

    private static int largestNumArray(int[] arr) {
        int largestNum = Integer.MIN_VALUE;
        for (int a : arr) {
            if (a > largestNum) {
                largestNum = a;
            }
        }
        return largestNum;
    }
}
