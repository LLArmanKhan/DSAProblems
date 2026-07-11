class Solution {
    String modify(String s) {
        if(s.charAt(0)>=65 && s.charAt(0)<=90) return s.toUpperCase();
        else return s.toLowerCase();
    }
}