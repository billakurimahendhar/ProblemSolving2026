class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if(map.get(arr[i])==arr[i])
            return arr[i];
        }
        return -1;
    }
}