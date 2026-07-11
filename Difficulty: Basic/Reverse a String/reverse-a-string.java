class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int n=s.length()-1;
        for(int i=n;i>-1;i--){
            sb.append(s.charAt(i));
        }
        String result = sb.toString();
        return result;
    }
}