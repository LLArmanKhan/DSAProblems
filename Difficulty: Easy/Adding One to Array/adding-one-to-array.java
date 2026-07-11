class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int carry=0,n=arr.length;
        Vector<Integer> v = new Vector<>();
        for(int i=n-1;i>=0;i--){
            int sum=carry;
            if(i==n-1) sum+=1;
            sum+=arr[i];
            v.add(sum%10);
            carry=sum/10;
        }
        if(carry!=0) v.add(carry);
        Collections.reverse(v);
        return v;
    }
}