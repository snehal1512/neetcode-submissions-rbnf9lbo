class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        for(int i=0;i<n;i++){
            if(!visited[i]){
                components++;
                bfs(graph,i,visited);
            }
        }
        return components;
    }

    private void bfs(List<List<Integer>> graph, int i, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();

            for(int neighbor: graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
