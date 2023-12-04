public class seiveOfEratosthenes{
    public static void main(String[] args) {
        int n = (int) 1e6 + 5;
        seive(n);
    }
    public static void seive(int n){
        int[] p = new int[n];
        for(int i = 1; i < n; i++){
            p[i] = 1;
        }
        for(int i = 2; i * i <= n; i++){
            if(p[i] == 1){
                for(int j = i * i; j < n; j+= i){
                    if(p[j] == 1){
                        p[j] = 0;
                    }
                }
            }
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(p[i] == 1){
                System.out.print(i + " " + c++);
            }
        }
    }
}