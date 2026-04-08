class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // boolean[] row = new boolean[rows];
        // boolean[] col = new boolean[cols];

        // for(int i=0;i<rows;i++) {
        //     for(int j=0;j<cols;j++) {
        //         if(matrix[i][j]==0) {
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }

        // for(int i=0;i<rows;i++) {
        //     for(int j=0;j<cols;j++) {
        //         if(row[i] || col[j]) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        boolean firstcolZero = false;

        for(int i=0;i<rows;i++) {

            if(matrix[i][0]==0) {
                firstcolZero = true;
            }

            for(int j=1;j<cols;j++) {
                if(matrix[i][j]==0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0]==0) {
            for(int j=0;j<cols;j++) {
                matrix[0][j]=0;
            }
        }

        if(firstcolZero) {
            for(int j=0;j<rows;j++) {
                matrix[j][0]=0;
            }
        }
    }
}
