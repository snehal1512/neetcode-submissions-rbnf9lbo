class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> listOfLists = new ArrayList<>();
        int n = strs.length;
        Map<Character, Integer>[] arrayOfMaps = new HashMap[n];

        for(int i=0;i<strs.length;i++){
            arrayOfMaps[i] = new HashMap<>();
            for(int j=0;j<strs[i].length();j++){
                if(arrayOfMaps[i].containsKey(strs[i].charAt(j))){
                    arrayOfMaps[i].put(strs[i].charAt(j),arrayOfMaps[i].get(strs[i].charAt(j))+1);
                } else {
                    arrayOfMaps[i].put(strs[i].charAt(j),1);
                }
            }
        }
        boolean[] visited = new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if (visited[i]) continue;
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);            
            visited[i] = true;
            for(int j=i+1; j< strs.length; j++) {
                if(arrayOfMaps[i].equals(arrayOfMaps[j]) && !visited[j]){
                    temp.add(strs[j]);
                    visited[j] = true;
                }
            }
            listOfLists.add(temp);
        }
        return listOfLists;
    }
}
