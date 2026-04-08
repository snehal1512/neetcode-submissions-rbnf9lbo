class Solution {
    public boolean makeEqual(String[] words) {

        Map<Character,Integer> map = new HashMap<>();

        int num = words.length;

        for(String str: words) {
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            // System.out.println(map.values());
        }

        for(char c: map.keySet()) {
            if(!(map.get(c)%num==0)) {
                return false;
            }
        }
        return true;
    }
}