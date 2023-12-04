import java.util.*;

public class dignaolTravese2 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> result = new ArrayList<>();
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});

        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] val = q.poll();
                result.add(nums.get(val[0]).get(val[1]));

                if(val[1] == 0 && val[0] + 1 < nums.size()){
                    q.add(new int[]{val[0] + 1, val[1]});
                }

                if(val[1] + 1 < nums.get(val[0]).size()){
                    q.add(new int[]{val[0], val[1] + 1});
                }
            }
        }
        int[] ans = new int[result.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = result.get(i);
        }

        return ans;
    }
}
