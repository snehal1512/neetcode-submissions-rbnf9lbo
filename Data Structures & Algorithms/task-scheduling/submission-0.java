class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for(char c: tasks) {
            freq[c - 'A']++;
        }

        int maxFreq = 0;

        for(int num:freq) {
           maxFreq = Math.max(maxFreq,num);
        }

        int countMax = 0;

        for(int num:freq) {
            if(num==maxFreq) countMax++;
        }

        int interval = maxFreq-1;
        int length = n + 1;

        int minInterval = interval*length + countMax;

        return Math.max(tasks.length, minInterval);
    }
}
