class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list= new ArrayList<>();
        helper(s,list,new ArrayList<>(),0);
        return list;
    }
    void helper(String s,List<List<String>> list,List<String> temp, int idx){
        if(idx==s.length()){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx+1;i<=s.length();i++){
            if(ispalindrome(s,idx,i-1)){
                temp.add(s.substring(idx,i));
                helper(s,list,temp,i);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean ispalindrome(String s, int start,int last){
        while(start<last){
            if(s.charAt(start++) != s.charAt(last--)){
               return false;
            }
        }
        return true;
    }
}