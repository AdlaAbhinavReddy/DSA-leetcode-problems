class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> alive = new Stack<>();

        alive.push(asteroids[0]);

        for (int i = 1; i < asteroids.length; i++) {
            int current = asteroids[i];

            if (current >= 0) {
                alive.push(current);
                continue;
            } else {
                int currentabs = Math.abs(current);
                while (!alive.isEmpty() && alive.peek() > 0 
                        && alive.peek() < currentabs) {
                    alive.pop();
                }
                if (!alive.isEmpty() && alive.peek() > 0 
                        && alive.peek() == currentabs) {
                    alive.pop();
                    continue;
                }
                if (!alive.isEmpty() && alive.peek() > 0 
                        && alive.peek() > currentabs) {
                    continue;
                }
                alive.push(current);
            }
        }
        int n = alive.size();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = alive.pop();
        }

        return ans;
    }
}
