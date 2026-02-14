class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:friends)
        set.add(i);
        int i=0;
        for(int j:order)
        {
            if(set.contains(j)){
                friends[i++]=j;
            }
        }
        return friends;
    }
}