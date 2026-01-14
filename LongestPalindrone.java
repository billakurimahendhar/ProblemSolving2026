class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         int odd=0;
         int even=0;
         boolean b=false;
        for(char i:map.keySet()){
          if(map.get(i)%2==1){
            odd+=map.get(i)-1;
            b=true;
          }
           even+=map.get(i)%2==0?map.get(i):0;
        }
      return b?1+ odd+even:even;
        
    }
}