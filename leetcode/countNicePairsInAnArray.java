public class countNicePairsInAnArray {
    public static int countNicePairs(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            System.out.print(revNum(nums[i]) + " ");
        }
        System.out.println();
        return count;
    }

    public static int revNum(int num){
        int revNum = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            revNum = revNum * 10 + rem;
        }

        return revNum;
    }

    /*
     * #defind mod = 100000007;
     * int rev(int num){
     * 
     * int val = 0;
     * while(num){
     *     int rem = num % 10;
     *     val = val * 10 + rem;
     *     num /= 10;
     *   }
     * 
     * 
     * }
     */

    public static void main(String[] args){
        int[] nums = {13,10,35,24,76};
        System.out.println(countNicePairs(nums));
    }
}
