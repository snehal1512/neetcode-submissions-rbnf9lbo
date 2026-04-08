class Solution {
    public void islandsAndTreasure(int[][] grid) {
        if(grid==null || grid.length==0) return;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<rows;i++){
            int count = 0;
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 0){
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for(int[] dir : dirs){

                int r = row + dir[0];
                int c = col + dir[1];

                if(r>=0 && r<rows && c>=0 && c<cols && grid[r][c]== 2147483647){
                    grid[r][c] = grid[row][col]+1;
                    queue.offer(new int[]{r,c});
                }
            }
        }
    }

}
