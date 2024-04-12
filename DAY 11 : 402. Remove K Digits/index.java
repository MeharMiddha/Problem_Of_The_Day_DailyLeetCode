class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n=num.length();
        for(Character c : num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            if(!st.isEmpty() || c!='0'){
                st.push(c);
            }
        }
        while(!st.isEmpty() && k-- >0) st.pop();
        if(st.isEmpty()) return "0";
        String ans="";
        while(!st.isEmpty()){
            ans=st.peek()+ans;
            st.pop();
        }
        return ans;
    }
}
