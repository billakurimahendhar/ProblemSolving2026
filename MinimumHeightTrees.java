class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<Integer>drl=new ArrayList<Integer>();

        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();
        if (n == 1) {
            drl.add(0);
            return drl;
        }


        for(int i = 0; i < n; i++)
            arl.add(new ArrayList<>());

        int indegree[] = new int[n];

      
        for(int i = 0; i < edges.length; i++){
            arl.get(edges[i][0]).add(edges[i][1]);
            arl.get(edges[i][1]).add(edges[i][0]);
            indegree[edges[i][1]]++;
            indegree[edges[i][0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(indegree[i] == 1)
                q.offer(i);
        }
       int rn=n;

        while(rn>2){
            int size=q.size();
         rn-=q.size();
         for (int i = 0; i < size; i++) {

                int leaf = q.poll();

                for (int neighbor : arl.get(leaf)) {

                    indegree[neighbor]--;

                    if (indegree[neighbor] == 1) {
                        q.offer(neighbor);
                    }
                }
            }
        }

          while (!q.isEmpty()) {
            drl.add(q.poll());
        }
        
        return drl;
    }
}