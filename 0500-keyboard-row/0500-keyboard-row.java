class Solution {
    public boolean check(String com,String str){
        int c=0;
         str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            if(com.contains(String.valueOf(ch)))
            c++;
        }
        return c==str.length();
    }
    public String[] findWords(String[] words) {
        String[] arr=new String[words.length];
        String [] comp={"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> l=new ArrayList<>();
        for(String str:words){
            for(String com:comp){
                if(check(com,str)){
                    l.add(str);
                }
            }
        }
        String[] res=new String[l.size()];
        int i=0;
        for(String j:l){
            res[i]=j;
            i++;
        }
        return res;
        
    }
}