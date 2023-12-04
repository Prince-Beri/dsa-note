public class allSubarrays {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        findAllSubArrays(arr, n);
    }
    static void findAllSubArrays(int[] arr, int n){
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = i; k < j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
