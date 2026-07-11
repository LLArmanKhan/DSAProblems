class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        int n=s.length(),i=0,j=0;
        StringBuilder sb = new StringBuilder(100);
        while(j<n) {
            if((int)(s.charAt(j))==32) j++;
            else if((int)(s.charAt(j))!=32 && (int)(s.charAt(i))==32){
                char temp=s.charAt(j);
                sb.append(Character.toUpperCase(temp));
                j++;i=j;
            }
            else if((int)(s.charAt(j))!=32 && (int)(s.charAt(i))!=32){
                sb.append(s.charAt(j));
                i++;j++;
            }
        }
        String result = sb.toString();
        return result;
    }
}