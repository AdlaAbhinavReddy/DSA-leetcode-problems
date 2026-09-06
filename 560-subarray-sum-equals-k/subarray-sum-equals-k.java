class Solution {
    public int subarraySum(int[] nums, int k) {
        int [] presum=new int[nums.length];
        int count=0;
        presum[0]=nums[0];
        if (presum[0] == k) { 
            count+=1;
        }
        for(int i=1;i<nums.length;i++){
            presum[i]=presum[i-1]+nums[i];
            if(presum[i]==k){
                count+=1;
            }
            for (int j = 0; j < i; j++) { 
                if (presum[i] - presum[j] == k) { 
                    count++;
                }
            }
        }
        return count;
    }
}