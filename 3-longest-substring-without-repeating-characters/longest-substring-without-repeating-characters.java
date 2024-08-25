class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charset = new HashSet<Character>();
        int count=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            for(int left=right;left<s.length();left++){
                if(!charset.contains(s.charAt(left))){
                charset.add(s.charAt(left));
                count++;
                    if(count>max){
                    max++;
                    }

                }else{
                    charset.clear();
                    count=0;
                    break;
                }
            }
        
        }
        return max;
    }
}