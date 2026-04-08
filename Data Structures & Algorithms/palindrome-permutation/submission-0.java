class Solution {
    public boolean canPermutePalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int oddCount = 0;

        for(char c: map.keySet()) {
            if(map.get(c)%2!=0) {
                oddCount++;
                if(oddCount>1) return false;
            }
        }
        return true;
    }
}
