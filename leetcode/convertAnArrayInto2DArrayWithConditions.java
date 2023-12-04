import java.util.*;
public class convertAnArrayInto2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < nums.length; j++){
                if(nums[j] != -1 && !list.contains(nums[j])){
                    list.add(nums[j]);
                    nums[j] = -1;
                }
            }
            result.add(list);
        }
        return result;
    }
}