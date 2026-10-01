class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            set.add(i);
        }
        for (int x : nums) {
            set.remove(x);
        }
        return set.iterator().next();
    }
}