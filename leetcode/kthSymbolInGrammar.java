public class kthSymbolInGrammar {
    public int kthGrammar(int n, int k) {
        if(n == 1 && k == 1) return 0;
        int mid = (int) (Math.pow(2 , n - 1) / 2);

        if(k <= mid){
            return kthGrammar(n - 1, k);
        }else{
            int num = kthGrammar(n - 1, k - mid);
            int com = 0;
            while(num > 0){
                // int rem = num % 10;
                // num /= 10;
                // if(rem == 0){
                //     com += 1;
                // }else{
                //     com += 0;
                // }
            }

            return com;
        }
    }
}
