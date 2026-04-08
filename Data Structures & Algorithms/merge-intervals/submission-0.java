class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length==0) return new int[0][0];

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for(int i=1;i<intervals.length;i++) {
            int[] next = intervals[i];

            if(next[0]<=current[1]) {
                current[1] = Math.max(next[1], current[1]);
            } else {
                result.add(current);
                current = next;
            }
        }
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
