import java.util.*;
public class pascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if(rowIndex < 0) return result;
        result.add(1);
        for(int i = 1; i <= rowIndex; i++){
            for(int j = result.size() - 1; j > 0; j--){
                result.set(j, result.get(j) + result.get(j - 1));
            }

            result.add(1);
        }
        return result;
    }

    public static void main(String[] args){
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }
}