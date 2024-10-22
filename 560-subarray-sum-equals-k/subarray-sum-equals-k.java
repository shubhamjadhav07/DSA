class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            prefix+=i;
            count+=map.getOrDefault(prefix-k,0);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }   
        return count;
    }
}