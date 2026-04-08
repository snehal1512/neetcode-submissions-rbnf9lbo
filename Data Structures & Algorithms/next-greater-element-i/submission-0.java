class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums2.length;i++) {
            map.put(nums2[i], i);
        }

        for(int i=0;i<nums1.length;i++) {
            int x = nums1[i];
            int j = map.get(x);
            int next = -1;

            for(int z=j+1;z<nums2.length;z++){
                if(nums2[z]>x) {
                    next = nums2[z];
                    break;
                }
            }
            nums1[i] = next;
        }
        return nums1;
    }
}