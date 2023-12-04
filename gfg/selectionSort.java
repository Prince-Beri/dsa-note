public class selectionSort {
    public static void main(String[] args){
        int[] arr = {10, 2, 5, 7, 19};

        selection(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void selection(int[] arr, int n){
        // T(O) -> n^2
        for(int i = 0; i < n - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

        }
    }
}
