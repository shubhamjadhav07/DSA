class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        helper(nums,list,new ArrayList<>(),0);
        return list;
    }
    void helper(int[] nums,List<List<Integer>> list,List<Integer> temp ,int idx){
        if(idx==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        helper(nums,list,temp,idx+1);
        temp.add(nums[idx]);
        helper(nums,list,temp,idx+1);
        temp.remove(temp.size()-1);
    }
}