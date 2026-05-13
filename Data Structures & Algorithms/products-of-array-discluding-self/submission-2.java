class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] x = new int[nums.length];

        x[0] = 1;

        for(int i=1;i<nums.length;i++){
            x[i] = nums[i-1]*x[i-1];
        }

        int r = 1;

        for(int i=nums.length-1;i>=0;i--){
            x[i] = x[i] * r;
            r = r * nums[i];
        }

        return x;
    }
}  
