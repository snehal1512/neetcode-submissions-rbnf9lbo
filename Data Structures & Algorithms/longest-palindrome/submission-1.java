class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int length = 0;
        boolean flag = false;

        for(char c : map.keySet()){
            if(map.get(c)>0){
                 if(map.get(c)%2==0){
                    length += map.get(c);
                 } else {
                    length += map.get(c)-1;
                    flag = true;
                } 
            }

        }

        if(flag) length++;

        return length;
    }
}