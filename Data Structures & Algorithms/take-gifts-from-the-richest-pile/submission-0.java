class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int gift: gifts) {
            pq.offer(gift);
        }

        while(k>0) {
            int max = pq.poll();

            max = (int)Math.sqrt(max);
            pq.offer(max);
            k--;
        }

        int sum = 0;

        while(!pq.isEmpty()) {
            sum+=pq.poll();
        }

        return sum;
    }
}