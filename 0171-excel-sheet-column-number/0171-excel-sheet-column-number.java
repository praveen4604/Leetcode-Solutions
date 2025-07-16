class Solution {
    public int titleToNumber(String str) {
        int c=0;
        for(int i=0;i<str.length();i++){
            int r=str.charAt(i)-64;
            c=c*26+(r);
        }
        return c;

    }
}