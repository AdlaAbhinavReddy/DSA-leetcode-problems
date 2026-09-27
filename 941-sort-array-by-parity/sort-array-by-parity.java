class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < even.size(); i++) {
            ans[i] = even.get(i);
        }
        int index = 0;
        for (int i = even.size(); i < nums.length; i++) {
            ans[i] = odd.get(index);
            index++;
        }
        return ans;
    }
}