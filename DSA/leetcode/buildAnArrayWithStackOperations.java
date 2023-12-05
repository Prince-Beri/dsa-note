import java.util.*;
public class buildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetIdx = 0, currNum = 1;
        while(targetIdx < target.length){
            if(target[targetIdx] == currNum){
                operations.add("Push");
                targetIdx++;
            }else{
                operations.add("Push");
                operations.add("Pop");
            }
            currNum++;
        }
        return operations;
    }
}