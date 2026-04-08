class Solution {
    public void solve(char[][] board) {

        if(board==null || board.length==0) return;

        int rows = board.length;
        int cols = board[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j] == 'O'){
                    List<int[]> region = new ArrayList<>();
                    boolean[] touchesBorder = new boolean[1];

                    dfs(board, i, j, region, touchesBorder);

                    if(!touchesBorder[0]) {
                        for(int[] cell: region) {
                            board[cell[0]][cell[1]] = 'X';
                        }
                    } else {
                        for(int[] cell: region) {
                            board[cell[0]][cell[1]] = 'O';
                        }
                    }
                }
            }
        }
    }

    private void dfs(char[][] board, int i,int j, List<int[]> region, boolean[] touchesBorder) {
        int rows = board.length, cols = board[0].length;

        if(i<0 || i>=rows || j<0 || j>=cols || board[i][j]!='O') return;

        region.add(new int[]{i,j});
        board[i][j] = '#';

        if(i==0 || i==rows-1 || j==0 || j==cols-1) {
            touchesBorder[0] = true;
        }

        dfs(board,i+1,j,region, touchesBorder);
        dfs(board,i-1,j,region, touchesBorder);
        dfs(board,i,j+1,region, touchesBorder);
        dfs(board,i,j-1,region, touchesBorder);
    }
}
