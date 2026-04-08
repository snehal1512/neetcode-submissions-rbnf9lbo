class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;
        
        for(String str: words) {
            if(str.length()<pref.length()) continue;

            if(str.substring(0,pref.length()).equals(pref)) {
                count++;
            }
        }

        return count;
    }
}