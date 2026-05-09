class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        if(grid == null || grid.length == 0) return 0;

        int maxArea = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    int size = dfs(grid,i,j);
                    maxArea = Math.max(maxArea, size);
                }
            }
        }

        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j){
        
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0) return 0;

        int size = 1;
        grid[i][j] = 0;

        size+= dfs(grid,i,j-1);
        size+= dfs(grid,i,j+1);
        size+= dfs(grid,i+1,j);
        size+= dfs(grid,i-1,j);

        return size;
    }
}
