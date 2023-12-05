import java.util.HashMap;
import java.util.Map;

public class minimumAdditionToMakeStringVaild {
    class Solution {
    public int addMinimum(String word) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : word.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        return 0;
    }
}
}
