import java.util.*;
public class allSubsequences {
    public static void main(String[] args){
        int n = 3;
        int[]arr = {3, 1, 2};
        List<Integer> list = new ArrayList<>();
        printF(0, arr, n, list);
    }
    public static void printF(int idx, int[]arr, int n, List<Integer> list){
        // T(O) -> 2^n & S(O) -> O(n).
        // base condition.
        if(idx == n){
            System.out.println(list.toString());
            return;
        }
        // not take case. 
        printF(idx + 1, arr, n, list);

        // take case.
        list.add(arr[idx]);
        printF(idx + 1, arr, n, list);

        // backtrack.
        list.remove(list.size() - 1);
        

    }
}