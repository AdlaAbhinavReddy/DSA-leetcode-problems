class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] missing=new int[k+1];
        int num=1,i=0,j=0;
        while(j<k){
            if(i>=arr.length || num<arr[i]){
                missing[j]=num;
                j++;
            }else if (num == arr[i]) {
                i++;
            }
            num++;
        }
        return missing[k-1];
    }
}