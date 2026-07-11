class Solution {
    int floorSqrt(int n) {
        // code here
        int root=1;
        int high=n,low=1;
        while(high>=low) {
            int mid=(high+low)/2;
            int sq=mid*mid;
            if (sq==n) return mid;
            else if(sq>n) high=mid-1;
            else{
                root=mid;
                low=mid+1;
            }
        }
        return root;
    }
}