class Solution {
    int count=0;
    public void increValue(int ind,int res[][]) {
        
        if(count%2==0) {
            for(int i=0;i<res[0].length;i++) {
                res[ind][i]++;
            }
            count++;
        }else{
            for(int i=0;i<res.length;i++) {
                res[i][ind]++;
            }
            count++;
        }
        //  for(int i=0;i<res.length;i++) {
        //     for(int j=0;j<res[0].length;j++) {
        //         System.out.print(res[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
    public int oddCells(int m, int n, int[][] indices) {
        int res[][] = new int[m][n];
        for(int i=0;i<indices.length;i++) {
            for(int j=0;j<indices[0].length;j++) {
                int ind=indices[i][j];
                increValue(ind,res);
            }
        }
        int odd=0;
         for(int i=0;i<res.length;i++) {
            for(int j=0;j<res[0].length;j++) {
                if(res[i][j] %2 !=0) odd++;
            }
        }
       
        return odd;
    }
}