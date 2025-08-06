
import java.util.Arrays;

public class SearchOccur {
     static int[] helper(int arr[], int index, int val, int count) {
        // Base case
        if (arr.length == index) {
            int result[] = new int[count];
            return result;
        }
        if (arr[index] == val) {
            count++;
        }
        int result[] = helper(arr, index + 1, val, count);
        // BackTrack
        if (arr[index] == val) {
            result[count - 1] = index;
        }
        return result;
    }

    static int[] searchOccur(int arr[], int index, int val) {
        return helper(arr, index, val, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 90, 10, 100, 10, 77, 10, 66 };
        int result[] = searchOccur(arr, 0, 10);
        // result contains
        // result[0] = 0 result[1] = 3 result[2] = 5 result[3] = 7

        System.out.println(Arrays.toString(result));
    }
}