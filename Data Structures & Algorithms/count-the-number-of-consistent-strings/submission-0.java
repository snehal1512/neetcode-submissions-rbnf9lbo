class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for(char c: allowed.toCharArray()){
            set.add(c);
        }

        int count = 0;

        for(String word: words){
            for(int i=0;i<word.length();i++){
                if(!set.contains(word.charAt(i))){
                    break;
                }
                if(set.contains(word.charAt(i)) && i==word.length()-1){
                    count++;
                }
            }
        }

        return count;
    }
}