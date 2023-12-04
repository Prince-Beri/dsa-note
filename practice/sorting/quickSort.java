import java.util.Arrays;

public class quickSort {

    public static void quickSortAlgo(int[] arr, int low, int high){
        if(low < high){
            int pIndex = partition(arr, low, high);
            quickSortAlgo(arr, low, pIndex - 1);
            quickSortAlgo(arr, pIndex + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = low;
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
                int[] arr = {1, 2, 5, 3, 6, 4, 4, 2, 1};
        // quickSortAlgo(arr, 0, arr.length - 1);
        quickSortAlgo(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
