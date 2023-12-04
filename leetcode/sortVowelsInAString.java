import java.util.*;
public class sortVowelsInAString {
    public String sortVowels(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }

        String reqVowel = "AEIOUaeiou";
        char[] ans = s.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!isVowel(s.charAt(i))) continue;

            while (count.getOrDefault(reqVowel.charAt(j), 0) == 0) {
                j++;
            }

            ans[i] = reqVowel.charAt(j);
            count.put(reqVowel.charAt(j), count.get(reqVowel.charAt(j)) - 1);
        }

        return new String(ans);
    }

    private boolean isVowel(char c) {
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}