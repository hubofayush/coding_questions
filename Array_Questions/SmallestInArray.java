
/**
 * SmallestInArray
 */
public class SmallestInArray {

    public static int smallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int a : arr){
            if(a < smallest){
                smallest = a;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = { 231, 41, 423, 5, 4, 2, };
        System.out.println(smallest(arr));
    }
}