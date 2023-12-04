import java.util.*;
public class minimumAmountOfTimeToCollectGarbag {
    public int garbageCollection(String[] garbage, int[] travel){
        int time = 0;
        
        Map<Character, Integer> last = new HashMap<>();
        for(int i = 0; i < garbage.length; i++){
            time += garbage[i].length();
            for(char ch: garbage[i].toCharArray()){
                last.put(ch, i);
            }
        }
        for(int i = 1; i < travel.length; i++){
            travel[i] += travel[i - 1];
        }

        for(char ch : "MGP".toCharArray()){
            if(last.getOrDefault(ch, 0) != 0){
                time += travel[last.getOrDefault(ch, 0) - 1];
            }
        }
        return time;

        /*
         * 
         * unordered_map<char, int> last;
         * int ans = 0;
         * for(int i = 0; i < garbage.size(); i++){
         *     ans += garbage[i].size();
         *     for(auto c: garbage[i]){
         *          last[c] = i;
         *     }
         * }
         * 
         * for(int i = 1; i < travel.size(); i++){
         *      travel[i] += travel[i - 1];
         *  }
         * 
         * for(auto c: "MGP"){
         *      if(last[c] != 0){
         *      ans += travel[last[c] - 1];
         *  }
         * }
         * 
         * return ans;
         */
    }
}
