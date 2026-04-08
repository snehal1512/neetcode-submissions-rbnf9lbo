class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strings) {

            String key = getKey(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private String getKey(String s) {
        StringBuilder key = new StringBuilder();

        int shift = s.charAt(0)-'a';

        for(char c: s.toCharArray()) {
            int diff = c - 'a' - shift;
            if(diff<0) diff+=26;
            key.append(diff).append('#');
        }

        return key.toString();
    }
}
