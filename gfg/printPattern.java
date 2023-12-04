import java.util.*;
public class printPattern {
    public static List<Integer> pattern(int n){
        List<Integer> ans = new ArrayList<>();
        help(n, ans);
        return ans;
    }

    private static void help(int n, List<Integer> ans){
        ans.add(n);
        if(n < 0) return;
        help(n - 5, ans);
        ans.add(n);
    }

    public static void main(String[] args){
        int n = 16;
        System.out.println(pattern(n));
    }
}