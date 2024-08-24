public class Average {
    public static int average(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum / n;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(average(arr));
    }
}
