public class searchInARowColumnMatrix {
    public static boolean search(int matrix[][], int n, int m, int x){
        int i = 0, j = m - 1;
        while(i < n && j >= 0){
            System.out.println(i + "  " + j );
            int value = matrix[i][j];
            if(value < x){
                i++;
            }else if(value > x ){
                j--;
            }else{
                return true;
            }
        }
        return false;
	}

    public static void main(String[] args){
        int n = 3, m = 3;
        int[][] matrix =  {{ 3, 30, 38},
                          {36, 43, 60},
                          {40, 51, 69}};

        int x = 40;

        System.out.println(search(matrix, n, m, x));
    }
}
