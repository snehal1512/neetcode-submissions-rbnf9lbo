class Solution {
    public boolean exist(char[][] board, String word) {
        
        int row = board.length;
        int col = board[0].length;

        boolean isPresent = false;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    isPresent = search(board,i,j,word);
                    if(isPresent){
                        return true;
                    }
                }
            }
        }

        return isPresent;
    }

    public boolean search(char[][] board, int i, int j, String word){

        if(word.length()==0) {
            return true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length){
            return false;
        }

        if(word.length()>0 && word.charAt(0)!=board[i][j]){
            return false;
        }

        boolean isPresent = false;

        char temp = board[i][j];
        board[i][j] = '#';

        isPresent = search(board, i+1, j, word.substring(1)) || 
        search(board, i-1, j, word.substring(1)) ||
        search(board, i, j+1, word.substring(1)) ||
        search(board, i, j-1, word.substring(1));

        board[i][j] = temp;

        return isPresent;

    }
}
