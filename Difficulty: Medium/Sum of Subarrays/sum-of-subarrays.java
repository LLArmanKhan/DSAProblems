class Solution {
    public int subarraySum(int[] arr) {
        // code here
        int n=arr.length,sum=0;
        for(int i=0;i<n;i++) {
            if(i==0 || i==n-1) sum+=n*arr[i];
            else {
                int TotalOcc=i*(n-i)+(n-i);
                sum+=arr[i]*TotalOcc;
            }
        }
        return sum;
    }
}
