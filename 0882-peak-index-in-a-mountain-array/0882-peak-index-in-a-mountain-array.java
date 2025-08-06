class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=1,r=arr[0];
        while(i<arr.length){
            if(r>arr[i])break;
            r=arr[i];
            i++;
        }
        return i-1;
    }
}