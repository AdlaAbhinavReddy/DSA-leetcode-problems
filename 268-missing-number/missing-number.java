class Solution {
    public int missingNumber(int[] nums) {
        long n=nums.length;
        int xr=0;
        for(int i=0;i<n;i++){
            xr=xr^nums[i];
            xr=xr^(i+1);

        }
        return xr;
    }
}