class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int depth=0;
        for(char i : s.toCharArray()){
            if(i=='(') depth++;
            else if(i==')') depth--;
            ans = ans>depth ? ans:depth;
        }
        return ans;
    }
}
