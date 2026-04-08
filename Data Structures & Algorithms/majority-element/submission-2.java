class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // int max = -1;
        // int finalNum = nums[0];

        // for(int num:nums){
        //     if(map.containsKey(num)){
        //         map.put(num,map.get(num)+1);
        //     } else {
        //         map.put(num,1);
        //     }
        //     if(map.get(num)>max) {
        //         max = map.get(num);
        //         finalNum = num;
        //     }
        // }
        // return finalNum;

        int count = 0;
        int candidate = 0;

        for(int num: nums){
            if(count == 0) {
                candidate = num;
            }

            count += (num==candidate)? 1 : -1;
        }

        return candidate;
    }
}