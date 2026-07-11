class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        int n=s.length(), count=0;
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            int val =(int)s.charAt(i);
            arr[val-97]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0) count++;
            else if(arr[i]%2!=0) return false;
        }
        if(count>1) return false;
        return true;
    }
}