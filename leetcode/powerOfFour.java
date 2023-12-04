public class powerOfFour{
    public static boolean isPowerOfFour(int n) {
       return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
       
        /* 
       // Log(n) Solution.
        if(n <= 0) return false;
        int num = n, count = 0;
        while(num > 1){
            num >>= 2;
            count += 2;
        }
        return (num << count) == n;
        */
    }

    public static void main(String[] args){
        int n = 0;
        System.out.println(isPowerOfFour(n));
    }
}