class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE,smax=max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            if(smax<arr[i] && arr[i]<max) smax=arr[i];
        }
        if(smax==Integer.MIN_VALUE) return -1;
        return smax;
    }
}