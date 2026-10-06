class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int e1 = 0, c1 = 0;
        int e2 = 0, c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                c1++;
            } else if (nums[i] == e2) {
                c2++;
            } else if (c1 == 0) {
                e1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                e2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        int minLimit = nums.length / 3;
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) {
                c1++;
            } else if (nums[i] == e2) {
                c2++;
            }
        }
        if (c1 > minLimit) {
            ans.add(e1);
        } 
        if (c2 > minLimit) {
            ans.add(e2);
        }
        return ans;
    }
}