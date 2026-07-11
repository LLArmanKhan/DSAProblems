// User function Template for Java

class Solution {

    String calc_Sum(int arr1[], int arr2[]) {
        // Complete the function
        int i=arr1.length-1,j=arr2.length-1,carry=0;
        StringBuilder ans = new StringBuilder();
        
        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0)
                sum+=arr1[i--];
            if(j>=0)
                sum+=arr2[j--];
            ans.append(sum%10);
            carry=sum/10;
        }
        ans.reverse();
        return ans.toString();
    }
}
