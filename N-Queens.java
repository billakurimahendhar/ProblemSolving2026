class Solution {
    void f(List<List<String>>drl,char a[][]){
        List<String>arl=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            String st="";
            for(int j=0;j<a.length;j++){
                if(a[i][j]=='Q')
                st+="Q";
                else
                st+=".";
            }
            arl.add(st);
        }
        drl.add(new ArrayList<>(arl));
    }
    void solve(List<List<String>>drl,char a[][],int row){
        if(row ==a.length){
            f(drl,a);
            return;
        }
        for(int i=0;i<a.length;i++){
            if(isValid(a,row,i)){
                a[row][i]='Q';
                solve(drl,a,row+1);
                a[row][i]='.';
            }
        }
    }
    boolean isValid(char a[][],int row ,int col){
        for(int i=0;i<a.length;i++){
            if(a[i][col]=='Q')
            return false;
        }
        int i=row,j=col;
        while(i>=0 && j>=0){
            if(a[i][j]=='Q')
            return false;
            i--;
            j--;

        }
         i=row;j=col;
        while(i>=0 && j<a.length){
            if(a[i][j]=='Q')
            return false;
            i--;
            j++;

        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>drl=new ArrayList<>();
        char a[][]=new char[n][n];
        solve(drl,a,0);
    return drl;
    }
}