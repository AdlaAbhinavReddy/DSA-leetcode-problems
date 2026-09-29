class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            while(!st.isEmpty() && st.peek()<=current){
                st.pop();
            }
            if (st.isEmpty()) {
                hp.put(current, -1);
            } else {
                hp.put(current, st.peek());
            }
            st.push(current);
        }
        int result[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=hp.get(nums1[i]);
        }
        return result;
    }
}