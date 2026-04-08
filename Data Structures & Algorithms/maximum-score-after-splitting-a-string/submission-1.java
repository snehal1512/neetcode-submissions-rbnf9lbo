public class Solution {
    public int maxScore(String s) {
        // res = Max of all (leftZeros + rightOnes)
        // res = Max of all (leftZeros + (totalOnes - leftOnes))
        // res = totalOnes (constant) + Max of all (leftZeros - leftOnes)

        int zeros = 0, ones = 0, res = Integer.MIN_VALUE;

        if (s.charAt(0) == '0') {
            zeros++;
        } else {
            ones++;
        }

        for (int i = 1; i < s.length(); i++) {
            res = Math.max(res, zeros - ones);
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        return res + ones;
    }
}