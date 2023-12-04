public class largest3SameDigiteNumberInString{
    public String largestGoodInteger(String num) {
        int ansDigite = -1;
        int i = 0;
        int start = 0;
        while(i < num.length()){
            if(i + 1 < num.length() && num.charAt(i) == num.charAt(i + 1)){
                i++;
                continue;
            }else{
                int len = i - start + 1;
                if(len >= 3){
                    ansDigite = Math.max(ansDigite,num.charAt(start) - '0');
                }
                start = i + 1;
                i++;
            }
        }
        if(ansDigite != -1){
            return new String(new char[]{(char) ansDigite, (char)ansDigite, (char)ansDigite});
        }else{
            return "";
        
        }
    }
}