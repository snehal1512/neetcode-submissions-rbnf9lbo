class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int number = 0;

        for(int num: nums){
            number^= num;
        }

        return number;
    }
}