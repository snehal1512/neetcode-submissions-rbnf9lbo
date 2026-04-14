class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num:nums){
            pq.offer(num);
            k--;

            if(k<0){
                pq.poll();
                k++;
            }
        }

        return pq.peek();
    }
}
