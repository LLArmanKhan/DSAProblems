class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int idx=-1;
        int high=arr.length-1,low=0;
        while(high>=low) {
            int mid=(high+low)/2;
            if(arr[mid]>x) high=mid-1;
            else {
                idx=mid;
                low=mid+1;
            }
        }
        return idx;
    }
}
