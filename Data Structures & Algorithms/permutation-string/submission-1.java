class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;

        Map<Character,Integer> map = new HashMap<>();

        for(char c: s1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int left = 0;
        int count = s1.length();

        for(int right=0;right<s2.length();right++) {
            char ch = s2.charAt(right);

            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);

                if(map.get(ch)>=0) {
                    count--;
                }
            }

            if(right-left+1>s1.length()){

                char leftChar = s2.charAt(left);

                if(map.containsKey(leftChar)) {

                    if (map.get(leftChar) >= 0) {
                        count++;
                    }
                    
                    map.put(leftChar,map.get(leftChar)+1);

                    
                }

                 left++;
            }

            if(count==0) return true;
        }

        return false;
    }
}
