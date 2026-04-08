class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1) return false;
        List<List<Integer>> tree = new ArrayList<>();

        for(int i=0;i<n;i++){
            tree.add(new ArrayList<>());
        }

        for(int[] edge: edges) {
            int edge1 = edge[0];
            int edge2 = edge[1];

            tree.get(edge1).add(edge2);
            tree.get(edge2).add(edge1);
        }

        boolean[] visited = new boolean[n];

        if(hasCycle(tree,0,-1,visited)) return false;

        for(boolean v: visited){
            if(!v) return false;
        }
        return true;
        
    }

    private boolean hasCycle(List<List<Integer>> tree, int node, int parent, boolean[] visited) {
        visited[node] = true;

        for(int neighbor: tree.get(node)){
            if(!visited[neighbor]) {
                if(hasCycle(tree,neighbor,node,visited)) {
                    return true;
                }
            } else if(neighbor!=parent){
                return false;
            }
        }
        return false;
    }
}
