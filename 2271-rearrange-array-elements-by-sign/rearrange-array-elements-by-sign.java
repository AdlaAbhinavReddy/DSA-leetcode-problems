class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>= 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
       for (int i = 0; i < (int)(nums.length)/2; i++) {
            ans[i*2]=positive.get(i);
            ans[i*2+1]=negative.get(i);
       }
       return ans;
    }
}
