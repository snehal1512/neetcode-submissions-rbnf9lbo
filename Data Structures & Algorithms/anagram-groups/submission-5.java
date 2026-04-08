class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String s: strs){
            char[] schar = s.toCharArray();
            Arrays.sort(schar);
            String key = new String(schar);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
