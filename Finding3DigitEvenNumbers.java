class Solution {
    void f(int a[],int l,int h,ArrayList<Integer>arl,boolean b[]){
        if(h<l)
        return;
        int l1=l;

           int t=l%10;
            l=l/10;

           int s=l%10;
            l=l/10;

           int f=l;
b=new boolean[a.length];
       
        for(int i=0;i<a.length;i++){
            if(!b[i] && a[i]==f){
                f=100;
                b[i]=true;
              
            }else if(!b[i] && a[i]==s){
                s=100;
      
               b[i]=true;
            }else if(!b[i] && a[i]==t){
                b[i]=true;
                t=100;
               
            }
        }
        if(f==100 && s==100 && t==100){
       
        arl.add(l1);
        }

        f(a,l1+2,h,arl,b);
    }
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer>arl=new ArrayList<>();
        boolean b[]=new boolean[digits.length];
        f(digits,100,998,arl,b);
        int a[]=new int [arl.size()];
        for(int i=0;i<arl.size();i++)
        a[i]=arl.get(i);
         Arrays.sort(a);
         return a;
    }
}