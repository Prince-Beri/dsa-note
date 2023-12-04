import java.util.*;
public class maximumElementAfterDecreasingAndRearranging {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int prev = 0, n = arr.length;
        for(int i = 0; i < n; i++){
            arr[i] = Math.min(arr[i], prev + 1);
            prev = arr[i];
        }
        return arr[n - 1];
    }
}