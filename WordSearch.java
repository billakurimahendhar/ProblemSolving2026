class Solution {
    boolean dfs(char a[][],int i,int j ,String word,int idx){
        if(i<0 || i>a.length-1 || j<0 ||j>a[0].length-1 )
        return false;
        if(word.charAt(idx)!=a[i][j])
        return false;
        if(idx==word.length()-1)
        return true;
        char c=a[i][j];
        a[i][j]='#';
        boolean flag= dfs(a,i+1,j,word,idx+1)||dfs(a,i-1,j,word,idx+1)||dfs(a,i,j+1,word,idx+1)||dfs(a,i,j-1,word,idx+1);
        a[i][j]=c;
        return flag;
          
          
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,i,j,word,0))
                return true;
            }
        }
        return false;
    }
}