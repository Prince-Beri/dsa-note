import java.util.*;
public class sumOfDistances {
    public static long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }

            map.get(nums[i]).add(i);
        }
        long sum = 0;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            // List<Integer> idxs = map.get(num).getValue();
        }
        // for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
        //     int val = entry.getKey();
        //     List<Integer> idxs = entry.getValue();
        //     System.out.print(val + "-> ");
        //     for(int idx: idxs){
        //         System.out.print(idx + " ");
        //     }
        //     System.out.println();
        // }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,3,1,1,2};
        System.out.println(Arrays.toString(distance(nums)));
    }
}
