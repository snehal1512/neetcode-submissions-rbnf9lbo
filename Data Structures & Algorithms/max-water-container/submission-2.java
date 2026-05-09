class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length-1;

        int maxCapacity = 0;

        while(l<r){
            
            int volume = (r-l) * Math.min(heights[r],heights[l]);

            maxCapacity = Math.max(maxCapacity, volume);

            if(heights[l]<heights[r]){
                l++;
            } else {
                r--;
            }
        }

        return maxCapacity;
    }
}
