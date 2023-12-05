import java.util.*;

public class subarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
        // {1,2,3,7,5} S = 12 
        // 1 3 6 13 18
        ArrayList<Integer> result = new ArrayList<>();
        // Map<Integer, Integer> map = new HashMap<>();

        
        result.add(-1);
        return result;
    }

    public static void main(String[] args){
        int n = 5;
        int[] arr = {1, 2, 3, 7, 5};
        int s = 12;
        System.out.println(subarraySum(arr, n, s));
    }
}
