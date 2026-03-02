class Solution {
    static String map[]={
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String>arl=new ArrayList<>();
        if(digits.length()==0)
        return arl;
        backtrack(arl,digits,0,new StringBuilder());
        return arl;
        
         
    }
    void backtrack(List<String>arl,String digits,int i,StringBuilder st){
        if(digits.length()==i){
            arl.add(st.toString());
            return ;
        }
        String letters=map[digits.charAt(i)-'0'];
        for(char ch:letters.toCharArray()) {
            st.append(ch);
            backtrack(arl,digits,i+1,st);
            st.deleteCharAt(st.length()-1);
        }
    }
}