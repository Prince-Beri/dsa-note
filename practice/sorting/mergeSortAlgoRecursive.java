import java.util.*;
public class mergeSortAlgoRecursive {
    public static void main(String[] args){
        // 1, 1, 2, 2, 3, 4, 4, 5, 6
        int[] arr = {1, 2, 5, 3, 6, 4, 4, 2, 1};
        // mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
        
    }
    public static int[] mergeSort(int[] arr, int left, int right){
        if(left == right) return new int[]{arr[left]};
        int mid = (left + right) / 2;
        int[] leftArr = mergeSort(arr, left, mid);
        int[] rightArr = mergeSort(arr, mid + 1, right);
        return mergeTwoSortedArrays(leftArr, rightArr);
        
    }

    public static int[] mergeTwoSortedArrays(int[] leftArr, int[] rightArr){
        int[] sortedArr = new int[leftArr.length + rightArr.length];
        int i = 0, j = 0, k = 0;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                sortedArr[k] = leftArr[i];
                i++;
                k++;
            }else{
                sortedArr[k] = rightArr[j];
                j++;
                k++;
            }
        }
        while(i < leftArr.length){
            sortedArr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < rightArr.length){
            sortedArr[k] = rightArr[j];
            j++;
            k++;
        }

        return sortedArr;
    }
}