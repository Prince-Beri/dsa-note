import java.util.*;
public class arithmaticSubsequence {
     public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        // nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
        for(int i = 0; i < l.length; i++){
            
            result.add(isAp(Arrays.copyOfRange(nums, l[i], r[i] + 1)));
        }
        return result;
      }
    private static Boolean isAp(int[]temp){
        // Arrays.sort(temp);
        // int diff = temp[1] - temp[0];
        // for(int i = 2; i < temp.length; i++){
           
        //     if(diff != temp[i] - temp[i - 1]){
        //         return false;
        //     }
            
        // }
        // return true;
        Map<Integer, Integer> map = new HashMap<>();
        int n = temp.length;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num: temp){
            max = Math.max(max, num);
            min = Math.min(min, num);
            map.put(num, 0);
        }
        if((max - min) % (n - 1) != 0) return false;
        int diff = (max - min) / (n - 1);
        int curr = min + diff;

        while(curr < max){
            if(!map.containsKey(curr)){
                return false;
            }
            curr += diff;
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {4, 6, 5, 9, 3, 7};
        int[] l = {0, 0, 2};
        int[] r = {2, 3, 5};

        System.out.println(checkArithmeticSubarrays(nums, l, r));
    }
}
