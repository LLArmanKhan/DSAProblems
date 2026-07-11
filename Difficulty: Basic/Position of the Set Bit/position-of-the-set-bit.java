class Solution {
    public int findPosition(int n) {
        // code here
        int count=0,idx=-1,i=0;
        while(n>0){
            if(n%2==1){
                count++;
                idx=i;
            }
            n/=2;
            i++;
        }
        if(count!=1) return -1;
        return idx+1;
    }
}