class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int lucky = -1;

        for(int num: arr) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num: arr) {
            if(map.get(num)==num) {
                lucky = Math.max(lucky,num);
            }
        }
        return lucky;
    }
}