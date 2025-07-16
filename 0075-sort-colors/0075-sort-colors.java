class Solution {
    public void sortColors(int[] nums) {
        int[] arr=new int[3];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(arr[r]==0){
                r++;
                if(arr[r]==0)
                r++;
            }
            nums[i]=r;
            arr[r]--;
        }
    }
}