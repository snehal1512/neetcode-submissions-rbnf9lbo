class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;
        int[] parent = new int[n+1];
        int[] rank = new int[n+1];

        for(int i=1;i<=n;i++){
            parent[i] = i;
        }

        for(int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];

            if(!union(u,v,parent,rank)) {
                return edge;
            }
        }
        return new int[0];
    }

    private int find(int[] parent, int x){
        if(parent[x] != x ) {
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }

    private boolean union(int x, int y,int[] parent, int[] rank) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);

        if(rootX == rootY) return false;

        if(rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else if(rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }

        return true;
    }
}
