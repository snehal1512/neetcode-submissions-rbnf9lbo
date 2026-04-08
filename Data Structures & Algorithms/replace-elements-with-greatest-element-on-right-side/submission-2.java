class Solution {
    public int[] replaceElements(int[] arr) {
        // for(int i=0;i<arr.length-1;i++) {
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]>max){
        //             max = arr[j];
        //             arr[i] = max;
        //         }
        //     }
        // }
        // arr[arr.length-1] = -1;
        // return arr;

        int maxRight = -1;

        for(int i=arr.length-1;i>=0;i--) {
            int temp = arr[i];
            arr[i] = maxRight;

            maxRight = Math.max(maxRight, temp);
        }
        return arr;
    }
}