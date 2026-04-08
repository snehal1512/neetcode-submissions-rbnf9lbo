class Solution {
    public int findCircleNum(int[][] isConnected) {
        int row = isConnected.length;
        int col = isConnected[0].length;

        boolean[] visited = new boolean[row];

        int provinces = 0;

        for(int i=0;i<row;i++){
            if(!visited[i]){
                dfs(isConnected, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city){

        visited[city] = true;

        for(int j=0;j<isConnected.length;j++){
            if(isConnected[city][j]==1 && !visited[j]){
                dfs(isConnected, visited, j);
            }
        }

    }
}