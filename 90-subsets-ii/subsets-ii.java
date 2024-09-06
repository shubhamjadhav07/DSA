class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list= new ArrayList<>();
        helper(nums,list,new ArrayList<>(),0);
        return list;
    }
    void helper(int[] nums, List<List<Integer>> list,List<Integer> arr, int idx){
        list.add(new ArrayList<>(arr));
        if(idx==nums.length){
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            arr.add(nums[i]);
            helper(nums,list,arr,i+1);
            arr.remove(arr.size()-1);
        }
        
    }
}