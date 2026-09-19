class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length-1;

        int maxCapacity = 0;

        while(l<r){
            int v = (r-l) * Math.min(heights[l],heights[r]);

            maxCapacity = Math.max(maxCapacity, v);

            if(heights[l]<heights[r]){
                l++;
            } else {
                r--;
            }
        }

        return maxCapacity;
    }
}
