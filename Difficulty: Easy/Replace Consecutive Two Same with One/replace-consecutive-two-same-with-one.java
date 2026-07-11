class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else {
                sb.append(s.charAt(i));
                i=j;
            }
        }
        sb.append(s.charAt(i));
        return sb.toString();
    }
}