class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int high=arr.length-1,low=0;
        while(high>=low) {
            int mididx=(high+low)/2;
            if(arr[mididx]>k) high=mididx-1;
            if(arr[mididx]<k) low=mididx+1;
            if(arr[mididx]==k) return true;
        }
        return false;
    }
}