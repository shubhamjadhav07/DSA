class Solution {
    public int findTheLongestSubstring(String s) {
        int count=0;
        int temp=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'){
                temp=temp^c;
            }else if(c=='e'){
                temp=temp^c;
            }else if(c=='i'){
                temp=temp^c;
            }else if(c=='o'){
                temp=temp^c;
            }else if(c=='u'){
                temp=temp^c;
            }
            if(map.containsKey(temp)){
                count=Math.max(i-map.get(temp),count);
            }else{
                map.put(temp,i);
            }
        }
        return count;
    }
}