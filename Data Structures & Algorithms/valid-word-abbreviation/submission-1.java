class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        if(word.equals(abbr)) return true;
        
        int i=0,j=0;

        while(i<word.length() && j<abbr.length()) {
            
            if(word.charAt(i)!=abbr.charAt(j)){
                if (abbr.charAt(j) == '0') return false;
                if(Character.isDigit(abbr.charAt(j))) {
                    int num = 0;
                    while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                        num = num * 10 + abbr.charAt(j) - '0';
                        j++;
                    }
                    i=i+num;
                }
                 else {
                    return false;
                }
                
            } else {
                i++;
                j++;
            }
        }
        return i==word.length() && j == abbr.length();
    }
}