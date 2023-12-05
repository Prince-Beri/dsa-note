public class countTheNumberOfHomogenousSubstings {
    public int countHomogenous(String s) {
        long ans = 0;
        int MOD = (int)1e9 + 7;
        for(int i = 0; i < s.length();){
            char c = s.charAt(i);
            long count = 0;
            while(i < s.length() && c == s.charAt(i)){
                count++;
                i++;
            }
            ans += ((count * (count + 1)) / 2) % MOD;
        }
        return (int) ans % MOD;
    }
}