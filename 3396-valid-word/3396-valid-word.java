class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        return false;
        String vowels="aeiou";
        int num=0,v=0,c=0;
        for(char r:word.toCharArray()){
            if(Character.isDigit(r)){
                num++;
            }
            else if(vowels.contains(String.valueOf(r).toLowerCase())){
                v++;
            }
            else if(r=='@' || r=='#' || r=='$'){
                return false;
            }
            else{
                c++;
            }
        }
        if(c>0 && v>0){
            
            return true;
        }
        return false;
    }
}