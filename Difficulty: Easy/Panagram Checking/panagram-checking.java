class Solution {
    public static boolean checkPangram(String s) {
        // code here
        String snew=s.toLowerCase();
        int n=s.length();
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            int temp=(int)snew.charAt(i);
            if(temp>96 && temp<123) arr[temp-97]++;
            else continue;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0) return false;
        }
        return true;
    }
}