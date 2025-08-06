class Solution {
    public boolean isNStraightHand(int[] arr, int g) {
        if(arr.length%g!=0){
            return false;
        }
        List<Integer> l=new ArrayList<>();
        for(int i:arr) l.add(i);
        Collections.sort(l);
        while(l.size()>0){
     
            int r=l.get(0);
            int i=0;
            while(i<g){
                if(l.contains(r)){
                    r++;
                    l.remove(Integer.valueOf(r-1));
                }
                else{
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}