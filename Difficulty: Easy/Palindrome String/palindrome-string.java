class Solution {
    boolean isPalindrome(String s) {
        // code here
        String s1 = s.toLowerCase();
        int i=0,j=s1.length()-1;
        while(j>i) {
            if(s1.charAt(i)!=s1.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
}