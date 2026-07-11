class Solution {
    public void segregateElements(int[] arr) {
        // code here
        int[] temp = new int[arr.length];
        int TempIndex=0,Pindex=0;
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<0) {
                temp[TempIndex]=arr[i];
                TempIndex++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>=0) {
            arr[Pindex]=arr[i];
            Pindex++;
            }
        }
        for(int i=Pindex;i<arr.length;i++) {
            arr[i]=temp[i-Pindex];
        }
    }
}