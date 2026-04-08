class Solution {
    public int countSeniors(String[] details) {

        int count = 0;
        
        for(String citizen: details) {
            String age = citizen.substring(11,13);

            if(Integer.parseInt(age)>60){
                count++;
            }
        }
        return count;
    }
}