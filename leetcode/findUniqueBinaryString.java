public class findUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            String num = nums[i];
             if(num.charAt(i) == '0'){
                    ans.append('1');
                }else{
                    ans.append('0');
                }
        }

        return ans.toString();
    }

    public static void main(String[] args){
        String[] nums = {"01","10"};
        System.out.println(nums);
    }
}