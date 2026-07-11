class Solution {
    public boolean isBalanced(String s) {
        // code here
        if(s.length()%2!=0 || s.charAt(0)==')') return false;
        if(s.charAt(0)=='}' || s.charAt(0)==']') return false;
        
        
        
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') st.push(s.charAt(i));
            else{
                if(st.size()==0) return false;
                if(Math.abs((int)st.peek()-(int)s.charAt(i))>2) return false;
                else st.pop();
            }
        }
        return (st.size()==0);
    }
}
