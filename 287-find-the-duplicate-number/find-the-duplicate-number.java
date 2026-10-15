class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            int count = hm.getOrDefault(num, 0);
            if(count>0){
                return num; 
            }else{
                hm.put(num,count+1);
            }
        }
        return 0;
    }
}