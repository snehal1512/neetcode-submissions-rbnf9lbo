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

        // for(int i=0;i<intervals.size();i++){
        //     for(int j=i+1;j<intervals.size();j++){
        //         Interval a = intervals.get(i);
        //         Interval b = intervals.get(j);

        //         if(!(b.start>=a.end || b.end<=a.start)){
        //             return false;
        //         }
        //     }
        // }
        // return true;

        if(intervals==null || intervals.size()==0) return true;

        intervals.sort((a,b)-> a.start-b.start);

        for(int i=1;i<intervals.size();i++){
            Interval prev = intervals.get(i-1);
            Interval curr = intervals.get(i);

            if(curr.start<prev.end){
                return false;
            }
        }
        return true;
    }
}
