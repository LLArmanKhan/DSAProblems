class Solution {
    public static void swap(int[] arr , int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    int missingNum(int arr[]) {
        // code here
        int i=0,n=arr.length;
        while(i<n){
            if(arr[i]==i+1) i++;
            else if(arr[i]==n+1) i++;
                else {
                    int temp = arr[i];
                    swap(arr,i,temp-1);  
        }            
        }
        int missing=-1;
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1) {
                missing=j+1;
                break;
            }
        }
        if(missing==-1) return n+1;
        else return missing;
    }
}