class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String s: strs){
            char[] ch = s.toCharArray();

            Arrays.sort(ch);

            String snew = new String(ch);

            result.computeIfAbsent(snew,k-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
