class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);

        while(low<high){
            int mid = (low+high)/2;

            if(countOfHours(piles,mid,h)){
                high = mid;
            } else {
                low = mid+1;
            }
        }

        return low;
    }

    private boolean countOfHours(int[] piles,int speed,int h){
       
        int hours = 0;

        for(int pile: piles){
            hours += Math.ceil((double)pile/speed);
        }

        return hours<=h;
    }

    private int getMax(int[] piles){
        int maxValue = Integer.MIN_VALUE;

        for(int pile:piles){
            maxValue = Math.max(maxValue,pile);
        }

        return maxValue;
    }
}
