class Solution {
    ArrayList<Integer> find(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int low=0,high=arr.length-1,idx=-1,mid=-1;
        while(low<=high){
            mid=(high-low)/2+low;
            if(arr[mid]==k) {idx=mid;high=mid-1;}
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
        ans.add(idx);
        idx=-1;
        low=0;high=arr.length-1;idx=-1;mid=-1;
        while(low<=high){
            mid=(high-low)/2+low;
            if(arr[mid]==k) {idx=mid;low=mid+1;}
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
        ans.add(idx);
        return ans;
    }
}
