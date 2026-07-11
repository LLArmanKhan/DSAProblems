class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int low=0,high=arr.length-1,idx=-1;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(arr[mid]==k) {idx=mid;high=mid-1;}
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
        return idx;
    }
}