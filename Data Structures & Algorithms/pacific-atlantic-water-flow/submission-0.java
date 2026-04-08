class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();

        if(heights==null || heights.length==0) return result;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            dfs(heights,pacific,i,0,Integer.MIN_VALUE);
            dfs(heights,atlantic,i,cols-1,Integer.MIN_VALUE);
        }

        for(int j=0;j<cols;j++){
            dfs(heights,pacific,0,j,Integer.MIN_VALUE);
            dfs(heights,atlantic,rows-1,j,Integer.MIN_VALUE);
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }

        return result;
    }

    public void dfs(int[][] heights,boolean[][] visited, int i, int j, int prevHeight){
        int rows = heights.length;
        int cols = heights[0].length;

        if(i<0 || i>=rows || j<0 || j>=cols || visited[i][j] || heights[i][j]<prevHeight) return;

        visited[i][j] = true;

        dfs(heights,visited,i,j-1,heights[i][j]);
        dfs(heights,visited,i,j+1,heights[i][j]);
        dfs(heights,visited,i+1,j,heights[i][j]);
        dfs(heights,visited,i-1,j,heights[i][j]);
    }
}
