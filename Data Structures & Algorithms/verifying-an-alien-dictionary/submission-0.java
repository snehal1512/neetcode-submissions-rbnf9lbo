class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }

        for(int i=0;i<words.length-1;i++){

            if(!incorrectOrder(words[i],words[i+1],map)){
                return false;
            }
        }

        return true;
    }

    private boolean incorrectOrder(String w1, String w2, Map<Character,Integer> map){

        int len = Math.min(w1.length(),w2.length());
        for(int i=0;i<len;i++){
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);

            if(c1!=c2){
                return map.get(c1) < map.get(c2);
            }
        }

        return w1.length()<=w2.length();
    }
}