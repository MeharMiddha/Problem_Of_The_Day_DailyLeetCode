class Solution {
    public boolean search(int i,int j,char[][] board,String word,int k){
        if(k==word.length()) return true;
        if(i<0 || j<0 || i==board.length || j==board[i].length || board[i][j]!=word.charAt(k)) return false;
        char ch = board[i][j];
        board[i][j]='#';
        boolean option1 = search(i+1,j,board,word,k+1);
        boolean option2 = search(i,j+1,board,word,k+1);
        boolean option3 = search(i-1,j,board,word,k+1);
        boolean option4 = search(i,j-1,board,word,k+1);
        board[i][j]=ch;
        return option1 || option2 || option3 || option4;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i,j,board,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
