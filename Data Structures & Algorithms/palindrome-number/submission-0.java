class Solution {
    public boolean isPalindrome(int x) {

        int revNum = 0;
        int original = x;

        while(x>0) {
            int rem = x%10;
            revNum = revNum*10 + rem;
            x = x/10;
        }

        return original==revNum;

    }
}