class Solution {
    public void sort012(int[] arr) {
        // code here
        int i=0,j=arr.length-1,target=2;
        while(j>=i){
            if(arr[j]==target) j--;
            else if(arr[i]!=target) i++;
            else if(arr[j]!=target && arr[i]==target){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
        i=0;target--;
        while(j>=i){
            if(arr[j]==target) j--;
            else if(arr[i]!=target) i++;
            else if(arr[j]!=target && arr[i]==target){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
    }
}