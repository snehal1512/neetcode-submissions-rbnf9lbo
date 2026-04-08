class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int key : map.keySet()) {
            int freq = map.get(key);

            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(key);
        }

        int[] result = new int[k];
        int index = 0;

        for(int i=buckets.length-1 ; i>=0 && index<k ; i--) {
            if(buckets[i] !=null){

                for(int num: buckets[i]){
                    result[index++] = num;
                    if(index == k) break;
                }
            }
        }

        return result;
    }
}
