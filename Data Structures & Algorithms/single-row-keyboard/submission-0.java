class Solution {
    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int prev = 0;

        for(int i=0;i<word.length();i++) {
            char c = word.charAt(i);

            int index = keyboard.indexOf(c);

            time += Math.abs(prev-index);

            prev = index;
        }

        return time;
    }
}
