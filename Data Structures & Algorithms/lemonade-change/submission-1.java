class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int returnBills = 0;
        int collected5 = 0;
        int collected10 = 0;

        for(int i=0;i<bills.length;i++) {
            
            if(bills[i]==5) {
                collected5++;
            } else if(bills[i]==10){
                if(collected5==0) {
                    return false;
                }
                collected10++;
                collected5--;
            } else {
                if(collected10>0 && collected5>0){
                    collected10--;
                    collected5--;
                } else if(collected5>=3) {
                    collected5-=3;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}