class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = nums[0];
        b[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++){
            a[i] = a[i - 1] + nums[i];
            int j = n - 1 - i;
            b[j] = b[j + 1] + nums[j];
        }
        for(int i=0;i<n;i++){
            int left = (i == 0) ? 0 : a[i - 1];
            int right = (i == n - 1) ? 0 : b[i + 1];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
