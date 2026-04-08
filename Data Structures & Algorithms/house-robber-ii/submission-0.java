class Solution {
    public int rob(int[] nums) {
        
        int maxRobValue = Math.max(maxRob(nums,1,nums.length), maxRob(nums,0,nums.length-1));

        return Math.max(nums[0], maxRobValue);
        
    }

    private int maxRob(int[] nums, int start, int end) {
        int rob1 = 0;
        int rob2 = 0;

        for(int i=start;i<end;i++) {

            int temp = Math.max(rob1+nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }
}
