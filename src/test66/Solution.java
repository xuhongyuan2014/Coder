package test66;
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        int n=0;
        while(m>=0&&n<matrix[0].length){
            if(matrix[m][n]==target){
                return true;
            }
            else if(matrix[m][n]<target) {
                n=n+1;
            }
            else if(matrix[m][n]>target){
                m=m-1;
            }
        }
        return false;
    }
}