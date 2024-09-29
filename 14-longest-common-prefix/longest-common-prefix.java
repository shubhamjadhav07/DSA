class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st=strs[0];
        for(int i =0;i<strs.length;i++){
            String current=strs[i];
            int j=0;
            while(j < st.length() && j < current.length() && st.charAt(j) == current.charAt(j)){
                j++;
            }
            st=st.substring(0,j);
            if(st==null){
                return "";
            }
        }
        return st;
    }
}