class Solution {
    public int openLock(String[] deadends, String target) {
        
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();

        Queue<String> q = new LinkedList<>();

        q.offer("0000");
        visited.add("0000");

        int steps = 0;

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i=0;i<size;i++){
                String curr = q.poll();

                if(curr.equals(target)) return steps;
                if(dead.contains(curr)) continue;

                for(String next: getNeighbors(curr)){
                    if(!visited.contains(next) && !dead.contains(next)){
                        visited.add(next);
                        q.offer(next);
                    }
                }
            }

            steps++;
        }

        return -1;
    }

    private List<String> getNeighbors(String s){
        List<String> res = new ArrayList<>();

        char[] arr = s.toCharArray();

        for(int i=0;i<4;i++) {
            char c = arr[i];

            arr[i] = (c == '9')? '0' : (char)(c+1);
            res.add(new String(arr));

            arr[i] = (c == '0') ? '9' : (char)(c-1);
            res.add(new String(arr));

            arr[i] = c;
        }

        return res;
    }
}