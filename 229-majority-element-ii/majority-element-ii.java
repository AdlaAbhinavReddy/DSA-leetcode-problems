class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }
        int minLimit = nums.length / 3;
        for (int x : hs.keySet()) {
            if (minLimit < hs.get(x)) {
                ans.add(x);
            }
        }
        return ans;
    }
}