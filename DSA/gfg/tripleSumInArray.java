import java.util.*;
public class tripleSumInArray {
    public static boolean find3Numbers(int A[], int n, int X){
        Arrays.sort(A);
        for(int i = 0; i < n; i++){
            int left = i + 1, right = n - 1;
            while(left < right){
                long sum = A[i] + A[left] + A[right];
                if(sum < X){
                    left++;
                }else if(sum > X){
                    right--;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int n = 6, x = 15;
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println(find3Numbers(arr, n, x));
    }
}
