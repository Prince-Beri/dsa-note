public class upperBound {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 7, 7, 7, 7, 7, 9, 11};
        int n = arr.length;
        int x = 7;
        System.out.println(lo(arr, n, x));
    }

    public static int lo(int[] arr, int n, int x){
        int ans = -1;
        int left = 0, right = n - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] < x){
                mid = right - 1;
            }else if(arr[mid] > x){
                mid = left + 1;
            }else{
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
