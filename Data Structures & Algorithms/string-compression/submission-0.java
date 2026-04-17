class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read = 0;
        int write = 0;

        while(read<n){
            int start = read;

            while(read<n && chars[read] == chars[start]) {
                read++;
            }

            chars[write++] = chars[start];

            int count = read - start;

            if(count>1){
                String value = String.valueOf(count);
                for(char c: value.toCharArray()){
                    chars[write++] = c;
                }
            }

        }

        return write;
    }
}