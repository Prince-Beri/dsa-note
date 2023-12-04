public class squareRootOfANumber {
    long floorSqrt(long x){
        // brute force approch.

        // long sRoot = 1;
		// for(int i = 1; i <= x; i++){
        //     if(i * i <= x){
        //         sRoot = i;
        //     }else{
        //         break;
        //     }
        // }
        // return sRoot;


        // binery search approch.
        long left = 1, right = x;
        while(left <= right){
            long mid = (left + right) / 2;
            if(mid * mid <= x){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return right;
    }
}