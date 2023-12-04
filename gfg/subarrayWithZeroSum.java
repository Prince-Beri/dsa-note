import java.util.HashMap;

public class subarrayWithZeroSum {
    static boolean findsum(int arr[],int n){
        // 1 2 3 4 5
        // prefixSum -> 1 3 6 10 15
        int presum = 0;
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
             presum += arr[i];

            if(map.containsKey(presum) || presum == 0){
                return true;
            }
            map.put(presum, 1);
        }
    
        return false;
    }
    public static void main(String[] args){
        int[] arr = {10,-10};
        int n = 2;
        System.out.println(findsum(arr, n));
    }
}