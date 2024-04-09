class Solution {
    public boolean checkValidString(String s) {
        int openCount=0,closeCount=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='*') openCount++;
            else openCount--;
            if(s.charAt(n-1-i)==')' || s.charAt(n-1-i)=='*') closeCount++;
            else closeCount--;
            if(openCount<0 || closeCount<0) return false;
        }
        return true;
    }
}
