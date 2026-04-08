class Solution {
    public int search(int[] nums, int target) {
        
        int l=0,r=nums.length - 1;
        int mid = (l+r)/2;

        while(l<=r){
            mid = (l+r)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target<nums[mid]){
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }
}
