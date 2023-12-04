import java.util.*;

public class maximumNumberCoinsYouCanGet {
    public int maxCoins(int[] piles) {
        int sum = 0;
        Arrays.sort(piles);
        
        for(int i = piles.length / 3; i < piles.length; i+=2){
            sum += piles[i];
        }
        return sum;
    }
}
