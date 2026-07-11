class Solution {
    int search(int[] arr, int key) {
        // code here
        boolean find=false;
        int n=arr.length;
        int high=n-1,low=0;
        while(high>=low) {
            int mid=low+(high-low)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]>=arr[0]) {
                if(key>=arr[low] && key<arr[mid]) high=mid-1;
                else low=mid+1;
            }
            else {
                    if(key>arr[mid] && key<=arr[n-1]) low=mid+1;
                    else high=mid-1;
            }
        }
        return -1;
    }
}