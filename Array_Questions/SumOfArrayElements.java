public class SumOfArrayElements {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 2 };
        System.out.println(sum(arr));
    }
}
