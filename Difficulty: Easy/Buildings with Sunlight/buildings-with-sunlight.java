class Solution {
    public int visibleBuildings(int[] arr) {
        // code here
        int i=0,j=1,n=arr.length;
        int count=0;
        while(j<n){
            if(arr[j]<arr[i]) {count++;j++;}
            else if(arr[j]>=arr[i]) {i=j;j++;}      
        }
        return n-count;
    }
}