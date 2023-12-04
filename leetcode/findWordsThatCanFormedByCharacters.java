import java.util.*;
public class findWordsThatCanFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        int goodWordsLengthSum = 0;
        int[] charFreq = new int[26];
        for(char ch: chars.toCharArray()){
            charFreq[ch - 'a']++;
        }
        for(String word: words){
            int[] tempFreq = Arrays.copyOf(charFreq, charFreq.length);
            int validCharCount = 0;
            for(char ch : word.toCharArray()){
                if(tempFreq[ch - 'a'] > 0){
                    validCharCount++;
                    tempFreq[ch - 'a']--;
                }
            }
            if(validCharCount == word.length()){
                goodWordsLengthSum += word.length();
            }
        }
        return goodWordsLengthSum;
    }
}