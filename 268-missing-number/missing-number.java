class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            a.add(i);
        }
        for (int x : nums) {
            a.remove(Integer.valueOf(x));
        }
        return a.get(0);
    }
}
