class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc]==color) return image;
        int original = image[sr][sc];

        fill(image,sr,sc,color,original);

        return image;
    }

    public void fill(int[][] image, int r, int c, int color,int original){

        if(r<0 || r>=image.length || c<0 || c>=image[0].length || image[r][c]!=original) {
            return;
        }

        image[r][c] = color;

        fill(image,r+1,c,color,original);
        fill(image,r-1,c,color,original);
        fill(image,r,c+1,color,original);
        fill(image,r,c-1,color,original);
        
    }
}