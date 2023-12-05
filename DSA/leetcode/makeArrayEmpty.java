import java.util.*;
public class makeArrayEmpty {

    public static long countOperationsToEmptyArray(int[] nums) {
        long n = nums.length, lastIdx = 0;
        long ans = n;
        Map<Integer, Integer> actualIdx = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            actualIdx.put(nums[i], i);
            // System.out.println(actualIdx.getOrDefault(nums[i], 0));
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int idx = actualIdx.get(nums[i]);
            System.out.println(idx + " " + lastIdx);
            if(idx < lastIdx){
                ans += n - i;
            }
            lastIdx = actualIdx.get(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {3,4,-1};
        System.out.println(countOperationsToEmptyArray(nums));
    }
}
