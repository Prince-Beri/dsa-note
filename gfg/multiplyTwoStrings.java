public class multiplyTwoStrings {
    public static String multiplyStrings(String s1,String s2)
    {
        boolean sign = false;
        int i = 0;
        while (i < s1.length() && s1.charAt(i) == '0'){
            i++;
            StringBuffer sb = new StringBuffer(s1);
 
            
            sb.replace(0, i, "");
    
        
            s1 = sb.toString();
        }
        
        
        int num1 = makeIntNum(s1);
        int num2 = makeIntNum(s2);

        int result = num1 * num2;
        if(sign){
            result *= -1;
        }
        return result + "";
    }
    
    private static int makeIntNum(String str){
        int num = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            int rem = str.charAt(i) - '0';
            num = (num * 10) + rem;
        }
    
        return num;
    }

    public static void main(String[] args){
        String s1 = "033";
        String s2 = "-2";
        System.out.println(multiplyStrings(s1, s2));
    }
}