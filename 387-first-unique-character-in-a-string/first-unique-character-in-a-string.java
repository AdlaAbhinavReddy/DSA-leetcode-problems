class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> uniqueChar =new HashMap();
        for(char ch:s.toCharArray()){
            uniqueChar.put(ch,uniqueChar.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(uniqueChar.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}