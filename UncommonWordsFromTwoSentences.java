class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s3=s1+" "+s2+"";
        String a[]=s3.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(String i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0,k=0;
        for(String i:map.keySet()){
            if(map.get(i)==1)
            c++;
        }

        String st[]=new String[c];
        for(String i:map.keySet()){
            if(map.get(i)==1)
            st[k++]=i;
        }
        return st;
    }
}