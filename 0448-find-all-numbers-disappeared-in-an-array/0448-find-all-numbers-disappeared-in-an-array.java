class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        int n=nums.length;
        int i;
        for(i=0;i<n;i++){
            s.add(nums[i]);
        }
        for(i=1;i<=n;i++){
            if(!(s.contains(i))){
                l.add(i);
            }
        }
        return l;
    }
}