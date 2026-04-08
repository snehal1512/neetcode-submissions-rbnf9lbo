class Solution {
    public double myPow(double x, int n) {
       long N = n;

       if(N<0) {
        x = 1/x;
        N = -N;
       }

       double result = 1;
       double curr = x;

       while(N>0) {
            if(N%2==1) {
                result *=curr;
            }
            curr *= curr;
            N/=2;
       }

       return result;
    }
}
