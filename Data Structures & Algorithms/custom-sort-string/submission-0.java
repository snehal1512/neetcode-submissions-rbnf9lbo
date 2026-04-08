class Solution {
    public String customSortString(String order, String s) {
        
        Map<Character,Integer> map = new HashMap<>();

        int i = 0;

        for(char c: order.toCharArray()){
            map.put(c,i);
            i++;
        }

        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        Collections.sort(list, (a,b) -> {
            int valA = map.getOrDefault(a, Integer.MAX_VALUE);
            int valB = map.getOrDefault(b, Integer.MAX_VALUE);

            return valA - valB;
        });

        StringBuilder str = new StringBuilder();

        for(char c: list) {
            str.append(c);
        }
        
        return str.toString();
    }
}