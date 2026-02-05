class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String>set=new HashSet<String>();
         for(int i=0;i<paths.size();i++){
            set.add(paths.get(i).get(0));
            set.add(paths.get(i).get(1));
         }
         for(int i=0;i<paths.size();i++){
            if(set.contains(paths.get(i).get(0)))
            set.remove(paths.get(i).get(0));
         }
         String st="";
         for(String i:set)
         st=i;
         return st;
    }
}