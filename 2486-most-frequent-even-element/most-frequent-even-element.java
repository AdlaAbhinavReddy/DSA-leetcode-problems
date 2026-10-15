class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int ans = -1;
        int maxFreq = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                hs.put(n, hs.getOrDefault(n, 0) + 1);
            }
        }
        for (int n : hs.keySet()) {
            if (maxFreq < hs.get(n) ||
            (hs.get(n) == maxFreq && (ans == -1 || n < ans))
            ) {
                maxFreq = hs.get(n);
                ans = n;
            }
        }
        return ans;
    }
}