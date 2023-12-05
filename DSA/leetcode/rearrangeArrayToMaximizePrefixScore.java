import java.util.*;
public class rearrangeArrayToMaximizePrefixScore {
    public int maxScore(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        Arrays.sort(nums);
        reverse(nums);

        int[] preSum = new int[nums.length];
        preSum[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            preSum[i] = preSum[i - 1] + nums[i];
        }
        for(int i = 0; i < preSum.length; i++){
            maxi = Math.max(maxi, preSum[i]);
        }
        return maxi;
    }
    public void reverse(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
