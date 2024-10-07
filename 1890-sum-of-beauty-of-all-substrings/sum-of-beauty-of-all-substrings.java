class Solution {
    public int beautySum(String s) {
        int total= 0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                total+=count(freq);
            }
        }
        return total;
    }
    private int count(int[] freq){
        int max=0,min=Integer.MAX_VALUE;
        for(int num:freq){
            if(num>0){
                max=Math.max(num,max);
                min=Math.min(num,min);
            }
        }
        return max-min;
    }
}