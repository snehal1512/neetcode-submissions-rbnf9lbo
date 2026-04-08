class Solution {
    public int tribonacci(int n) {

        if(n==0) return 0;
        if(n==1 || n==2) return 1;

        int a = 0;
        int b = 1;
        int c = 1;

        int i=3;
        while(i<=n) {
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
            i++;
        }

        return c;
    }
}