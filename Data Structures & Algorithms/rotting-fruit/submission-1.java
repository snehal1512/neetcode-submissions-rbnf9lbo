class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;
        int fresh=0;

        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                } else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;

        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int minutes = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean infected = false;
            for(int i=0;i<size;i++) {
                int[] cell = queue.poll();

                int row = cell[0];
                int col = cell[1];

                for(int[] dir: dirs){
                    int r = row+dir[0];
                    int c = col+dir[1];

                    if(r>=0 && r<rows && c>=0 && c<cols && grid[r][c]==1){
                        grid[r][c] = 2;
                        queue.offer(new int[]{r,c});
                        fresh--;
                        infected = true;
                    }
                }
            }            
            if(infected) minutes++;
        }
        if(fresh==0) return minutes;
        else return -1;
    }
}
