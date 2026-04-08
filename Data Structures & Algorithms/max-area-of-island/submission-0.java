class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length==0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int max = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    int area = dfs(grid,i,j);
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }

        grid[i][j] = 0;
        int size=1;

        size +=dfs(grid, i+1, j);
        size +=dfs(grid, i-1, j);
        size +=dfs(grid, i, j-1);
        size +=dfs(grid, i, j+1);

        return size;
    }
}
