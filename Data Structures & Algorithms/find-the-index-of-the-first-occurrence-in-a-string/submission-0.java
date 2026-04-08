class Solution {
    public int strStr(String haystack, String needle) {

        int result = -1;
        
        for(int i=0;i<haystack.length();i++) {
            int j=0;
            int m = i;
            while(j<needle.length() && m<haystack.length() && haystack.charAt(m)==needle.charAt(j)){
                m++;
                j++;
            }
            if(j==needle.length())  {
                return i;
            }           
        }

        return result;
    }
}