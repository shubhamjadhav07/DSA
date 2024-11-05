class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        for(char st : s.toCharArray()){
            if(st=='('){
                open++;
            }else if(st==')'){
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
            
        } 
        return open+close;      
    }
}