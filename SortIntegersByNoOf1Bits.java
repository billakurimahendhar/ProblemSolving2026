class Solution {
    public int[] sortByBits(int[] arr) {
        int a[]=new int[arr.length];
        int b[][]=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            int c=0;
            while(k!=0){
               if(k%2==1)
               c++;
               k=k/2;
            }
            b[i][0]=arr[i];
            b[i][1]=c;
        }
         Arrays.sort(b, (x, y) -> {
            if(x[1] == y[1]) 
                return x[0] - y[0]; 
            return x[1] - y[1];     
        });
        for(int i = 0; i < arr.length; i++){
            a[i] = b[i][0];
        }

        return a;

    }
}