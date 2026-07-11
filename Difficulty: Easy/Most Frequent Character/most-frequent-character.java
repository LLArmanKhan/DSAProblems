class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int result=0;
        int max=Integer.MIN_VALUE;
        int[] arr = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++) {
            int idx=s.charAt(i);
            arr[idx-97]+=1;
        }
        for(int i=0;i<26;i++) {
            if(arr[i]>max) {max=arr[i];result=i;}
        }
        return (char)(97+result);
    }
}