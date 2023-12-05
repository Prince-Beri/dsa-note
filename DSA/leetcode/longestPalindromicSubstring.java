public class longestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() < 1 || s == null) return "";
        
        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandFromMid(s, i, i);
            int len2 = expandFromMid(s, i, i + 1);

            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }
    public int expandFromMid(String str, int left, int right){
        if(str == null || left > right) return 0;
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
