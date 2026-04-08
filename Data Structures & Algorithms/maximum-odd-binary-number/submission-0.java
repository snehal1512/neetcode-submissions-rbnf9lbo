class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int count1 = 0;
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()){
            if(c=='1'){
                count1++;
            }
        }

        for(int i=0;i<count1-1;i++){
            sb.append(1);
        }

        for(int i=0;i<n-count1;i++){
            sb.append(0);
        }

        return sb.append(1).toString();
    }
}