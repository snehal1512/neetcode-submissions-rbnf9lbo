class Solution {
    public boolean isPerfectSquare(int num) {
        
        // int odd = 1;

        // while(num>0) {
        //     num-=odd;
        //     odd+=2;
        // }

        // return num==0;

        long left = 1;
        long right = num;

        while(left<=right) {

            long mid = left + (right-left)/2;
            long square = mid*mid;

            if(square==num) return true;
            else if(num<square) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}