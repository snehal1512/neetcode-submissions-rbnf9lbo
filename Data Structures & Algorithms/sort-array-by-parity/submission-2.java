class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int i=0, j=nums.length-1;

        while(i<j){
            while(i<j && nums[i]%2==0){
                i++;
            }

            while(i<j && nums[j]%2==1){
                j--;
            }

            if(i<j) {
                swap(nums,i,j);
                i++;
                j--;
            }

        }

        return nums;
    }

    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}