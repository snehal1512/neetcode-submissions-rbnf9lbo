class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int x[] = new int[2];

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int y = nums[i];
            int diff = target - y;

            if(map.containsKey(diff) && i!=map.get(diff)){
                if(i>map.get(diff)){
                    x[1] = i;
                    x[0] = map.get(diff);
                } else {
                    x[0] = i;
                    x[1] = map.get(diff);
                }
            }
        }
        return x;
    }
}
