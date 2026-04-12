class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        Map<Integer,List<int[]>> map = new HashMap<>();

        for(int[] flight: flights){

            int to = flight[1];
            int from = flight[0];
            int cost = flight[2];

            map.putIfAbsent(from, new ArrayList<>());
            map.get(from).add(new int[]{to,cost});

        }

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{src,0,0});
        int minCost = Integer.MAX_VALUE;

        int[] minCostAtNode = new int[n];
        Arrays.fill(minCostAtNode, Integer.MAX_VALUE);

        while(!q.isEmpty()){
            int[] curr = q.poll();

            int node = curr[0];
            int cost = curr[1];
            int stops = curr[2];

            if(node == dst) {
                minCost = Math.min(minCost,cost);
                continue;
            }

            if(stops>k) continue;

            if(map.containsKey(node)) {

                for(int[] nei: map.get(node)) {
                    int nextNode = nei[0];
                    int nextCost = nei[1];
                    int newCost = cost + nextCost;

                    if(newCost >= minCost) continue;
                    if(newCost >= minCostAtNode[nextNode]) continue; // ← prune revisits

                    minCostAtNode[nextNode] = newCost;

                    q.offer(new int[]{nextNode, cost+nextCost, stops+1});
                }
            }

           
        }

        return minCost == Integer.MAX_VALUE? -1 : minCost;
    }
}
