class Solution {
    public int longestSubarray(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(m<nums[i]){
                m=nums[i];
            }
        }
        int c=0,a=0;
        for(int i:nums){
            if(i==m){
                c++;
            }
            else{
                c=0;
            }
            if(a<c){
                a=c;
            }
        }
        return a;
    }
}