class Solution {
    public boolean confusingNumber(int n) {
        int original = n;
        int finalNum = 0;
        while(n!=0) {
            int num = n% 10;

            if(num==2 || num==5 || num==7 || num==3|| num==4) {
                return false;
            }
            finalNum = finalNum*10;

            if(num==6) finalNum+=9;
            else if(num==9) finalNum+=6;
            else finalNum += num;

            n = n /10;
        }

        return finalNum!=original;
    }
}
