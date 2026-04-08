class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0, n = mat.length;

        for(int i=0;i<n;i++) {
            res += mat[i][i];
            res += mat[i][n-i-1];
        }

        return res - (n%2==1? mat[n/2][n/2]: 0);
    }
}