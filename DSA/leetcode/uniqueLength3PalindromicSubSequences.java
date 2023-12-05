import java.util.*;
public class uniqueLength3PalindromicSubSequences{

public class CharacterRangeCount {

    static class Pair<F, S> {
        private F first;
        private S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        public void setFirst(F first) {
            this.first = first;
        }

        public void setSecond(S second) {
            this.second = second;
        }
    }

    public static int countCharacterRanges(String s) {
        Map<Character, Pair<Integer, Integer>> mp = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            mp.put(c, new Pair<>(-1, -1));
        }

        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (mp.get(c).getFirst() == -1) {
                mp.get(c).setFirst(i);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (mp.get(c).getSecond() == -1) {
                mp.get(c).setSecond(i);
            }
        }

        int ans = 0;

        for (Map.Entry<Character, Pair<Integer, Integer>> entry : mp.entrySet()) {
            int start = entry.getValue().getFirst();
            int end = entry.getValue().getSecond();
            Set<Character> st = new HashSet<>();

            for (int i = start + 1; i < end; i++) {
                st.add(s.charAt(i));
            }
            ans += st.size();
        }

        return ans;
    }

    
}

}