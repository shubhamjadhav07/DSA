class Solution {
    static HashMap<Character, Integer> tohash(String s){
        Map<Character, Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            Character ch= s.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                int currentfreq= map.get(ch);
                map.put(ch,currentfreq+1);
            }
        }
        return (HashMap<Character, Integer>) map;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>s1=tohash(s);
        HashMap<Character,Integer>s2=tohash(t);
        return s1.equals(s2);
    }
}