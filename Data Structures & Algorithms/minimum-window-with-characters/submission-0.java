class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();

        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int left = 0;
        int count = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c)>=0){
                    count++;
                }
            }

            while(count == t.length()){

                if(right-left+1 < min){
                    min = right-left+1;
                    start = left;
                }
                char ch = s.charAt(left);

                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch)+1);

                    if(map.get(ch)>0){
                        count--;
                    }
                }

                left++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start+min);
    }
}
