import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void countFrequency(int[] arr) {

        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int a : arr) {
            if (ans.containsKey(a)) {
                ans.put(a, ans.get(a) + 1);
            } else {
                ans.put(a, 1);
            }
        }
        for (Map.Entry<Integer, Integer> num : ans.entrySet()) {
            System.out.println(num.getKey() + ":" + num.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 21, 3, 41, 21, 1, 21, 41, 3, 12, 21, 12, 21 };
        countFrequency(arr);
    }
}
