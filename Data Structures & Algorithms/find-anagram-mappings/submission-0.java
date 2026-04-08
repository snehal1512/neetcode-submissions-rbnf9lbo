class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map2 = new HashMap<>();

        int i=0;

        while(i<nums1.length){
            map2.put(nums2[i],i);
            i++;
        }

        int[] result = new int[nums1.length];
        i = 0;

        while(i<nums1.length) {
            int x = nums1[i];
            result[i] = map2.get(x);
            i++;
        }
        return result;
    }
}
