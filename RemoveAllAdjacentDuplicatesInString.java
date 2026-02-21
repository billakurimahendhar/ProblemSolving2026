class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>sta=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(sta.isEmpty())
            sta.push(s.charAt(i));
            else if(sta.peek()==s.charAt(i))
            sta.pop();
            else{
                sta.push(s.charAt(i));
            }
        }
        String st="";
        while(!sta.isEmpty()){
             char a=sta.pop();
             st=a+st;
        }
        return st;
    }
}