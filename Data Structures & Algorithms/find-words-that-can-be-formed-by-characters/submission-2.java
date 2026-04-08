class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;        

        for(String word: words){

            Map<Character,Integer> map = new HashMap<>();

            for(char c: chars.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }

            for(int i=0;i<word.length();i++){
                if(!map.containsKey(word.charAt(i)) || map.get(word.charAt(i))==0){
                    break;
                }
                if(map.containsKey(word.charAt(i)) && (map.get(word.charAt(i))>0) && i==word.length()-1){
                    count += word.length();
                }
            
                map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)-1);
            }
        }

        return count;
    }
}