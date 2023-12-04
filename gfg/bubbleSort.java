public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {10, 2, 5, 7, 19};

        bubble(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubble(int[] arr, int n){
        // T(O) -> n^2
        for(int i = 0; i < n - 1; i++){
            boolean swap = false;
            for(int j = 0; j < n - 1 -i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j]  = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
            

        }
    }

}
