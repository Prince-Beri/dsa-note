import java.util.*;
public class NumberOfEvenAndOddBits {
    public static void main(String[] args){
        int n = 17;
        System.out.println(Arrays.toString(evenOddBit(n)));
    }
    public static int[] evenOddBit(int n) {
        StringBuilder sb = new StringBuilder();
        int even = 0, odd = 0;
        int num = n;
        while(num > 0){
            int rem = num % 2;
            num /= 2;
            sb.append(rem + "");
        }
        System.out.println(sb.toString());
        for(int i = 0; i < sb.toString().length(); i++){
            if(sb.charAt(i) == '1' && i % 2 == 0){
                even++;
            }else if(sb.charAt(i) == '1' && i % 2 == 1){
                odd++;
            }
        }

        return new int[]{even, odd};
         
    }
}