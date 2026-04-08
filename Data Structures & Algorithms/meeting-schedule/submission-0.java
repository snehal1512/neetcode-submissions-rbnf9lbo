/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        for(int i=0;i<intervals.size();i++){
            for(int j=i+1;j<intervals.size();j++){
                Interval a = intervals.get(i);
                Interval b = intervals.get(j);

                if(!(b.start>=a.end || b.end<=a.start)){
                    return false;
                }
            }
        }
        return true;
    }
}
