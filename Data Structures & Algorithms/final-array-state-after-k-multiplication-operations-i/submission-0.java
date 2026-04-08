class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        );

        int i=0;
        for(int num:nums) {
            pq.offer(new int[]{num,i});
            i++;
        }

        while(k>0) {
            int x[] = pq.poll();

            x[0] = x[0]*multiplier;
            pq.offer(x);

            k--;
        }

        while(!pq.isEmpty()) {
            int[] x = pq.poll();

            nums[x[1]] = x[0];    
        }

        return nums;
    }
}