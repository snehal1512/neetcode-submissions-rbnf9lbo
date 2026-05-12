class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int length;

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);

            if(!set.contains(c)){
                length = right-left+1;
                maxLength = Math.max(maxLength,length);
            }

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
        }

        return maxLength;
    }
}
