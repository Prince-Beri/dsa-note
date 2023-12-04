import java.util.*;

public class mergeTwoSortedArraysWithoutAnyExtraSpace {
    public void merge(int arr1[], int arr2[], int n, int m) {
        int i = n - 1, j = 0;

        while(i >= 0 && j < m){
            if(arr1[i] > arr2[j]){
                swap(arr1, arr2, i, j);
                i--;
                j++;
            }else{
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public void swap(int[] arr1, int[] arr2, int left, int right){
        int temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
    }
}
