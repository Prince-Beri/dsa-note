public class maximumNumbreOfFishInAGrid {
    
        public static int findMaxFish(int[][] grid) {
            int maxFishes = 0;
            int[][] visited = new int[grid.length][grid[0].length];
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[0].length; j++){
                    if(visited[i][j] == 0){
                        int sum = dfs(grid, visited, i, j);
                        maxFishes = Math.max(maxFishes, sum);
                    }
                }
            }
            return maxFishes;
        }
    
        private static int dfs(int[][] grid, int[][] visited, int row, int col){
            int n = grid.length, m = grid[0].length;
            if(row < 0 || row >= n || col < 0 || col >= m || grid[row][col] == 0 || visited[row][col] == 1) return 0;
    
            int sum = grid[row][col];
    
            visited[row][col] = 1;
    
            sum += dfs(grid, visited, row + 1, col);
            sum += dfs(grid, visited, row - 1, col);
            sum += dfs(grid, visited, row, col + 1);
            sum += dfs(grid, visited, row, col - 1);
    
            return sum;
        }

        public static void main(String[] args) {
            int[][] grid = {{0,2,1,0},{4,0,0,3},{1,0,0,4},{0,3,2,0}};
            System.out.println(findMaxFish(grid));
        }
    }

