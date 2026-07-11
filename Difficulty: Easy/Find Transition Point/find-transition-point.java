class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int i=0,j=1;
        if(arr[i]!=0) return 0;
        if(arr[arr.length-1]!=1) return -1;
        while(j<arr.length){
            if(arr[i]==0 && arr[j]==1) return j;
            i++;j++;
        }
        return 0;
    }
}