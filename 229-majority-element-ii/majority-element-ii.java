class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        List<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        n=n/3;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue()>n){
                arr.add(mp.getKey());
            }
        }
        return arr;
    }
}