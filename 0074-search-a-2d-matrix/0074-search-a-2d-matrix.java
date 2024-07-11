class Solution {

    public boolean check(int a[],int k) {
        int left =0;
        int right = a.length-1;
        
        while(left <=right) {
            int mid = (left + (right - left) / 2);
            if(a[mid] ==k){
                return true;
            }
            else if(k<a[mid]) {
                right = mid-1;
            }
            else if(k>a[mid]) {
                left =mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int row[] : matrix) {
            if(check(row,target)) {
                return true;
            }
        }
        return false;
    }
}