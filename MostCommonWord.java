class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        HashMap<String,Integer>map=new HashMap<>();
        String a[] = paragraph.split("\\s+");
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int max=0;
        String st=a[0];
        for(String key:map.keySet()){
            boolean flag=false;
            for(int i=0;i<banned.length;i++){
               if(banned[i].equals(key)){
                    flag = true;
                    break;
                }
            }
            if(!flag && map.get(key) > max){
                max = map.get(key);
                st = key;
            }
        }
        return st;
    }
}