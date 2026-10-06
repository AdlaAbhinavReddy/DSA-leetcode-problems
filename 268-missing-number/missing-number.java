class Solution {
    public int missingNumber(int[] nums) {
        long n=nums.length;
        long s=0;
        long sn=(n*(n+1))/2;
        for(int i:nums){
            s+=i;
        }
        return (int)(sn-s);
    }
}