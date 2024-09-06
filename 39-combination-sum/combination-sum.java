class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list= new ArrayList<>();
        helper(candidates,list,target,0,new ArrayList<>());
        return list;
    }
    void helper(int[] nums,List<List<Integer>> list,int tar,int idx,List<Integer> arr){
        if(tar<0){
            return;
        }else if(tar==0){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            arr.add(nums[i]);
            helper(nums,list,tar-nums[i],i,arr);
            arr.remove(arr.size()-1);
        }
               
    }
}