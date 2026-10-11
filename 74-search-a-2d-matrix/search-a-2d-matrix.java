class Solution {
    public static boolean bs(int[] mat, int target) {
        int low = 0, high = mat.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mat[mid] == target) {
                return true;
            }
            if (mat[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0,high=matrix.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if (matrix[mid][0] <= target &&
                target <= matrix[mid][col - 1]) {
                return bs(matrix[mid], target);
            }
            if (matrix[mid][0] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}