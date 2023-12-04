import java.util.*;
public class highAccessEmployee {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        // [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
        for(List<String> str : access_times){
            String p = str.get(0);
            List<String> at = new ArrayList<>();
            if(map.containsKey(p)){
                map.get(p).add(str.get(1)); 
            }else{
                map.put(p, at);
                map.get(p).add(str.get(1));

            }
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            List<String> accessTimes = entry.getValue();
            if(accessTimes.size() >= 3){
               Collections.sort(accessTimes);
               String str = accessTimes.get(0);
                System.out.println(str);
                
            }
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
        }
        return ans;
    }
}