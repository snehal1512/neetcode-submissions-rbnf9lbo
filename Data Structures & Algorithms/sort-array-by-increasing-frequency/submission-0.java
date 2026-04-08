class Solution {
    public int[] frequencySort(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> {
                if(!map.get(a).equals(map.get(b))) {
                    return map.get(a) - map.get(b);
                }
                return b - a;
            }
        );

        for(int num: nums) {
            pq.offer(num);
        }

        int i=0;

        while(i<nums.length) {
            nums[i++] = pq.poll();
        }

        return nums;
    }
}