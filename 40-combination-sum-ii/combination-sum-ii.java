class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     Arrays.sort(candidates);
     List<List<Integer>> list= new ArrayList<>();
     helper(candidates,list,target,new ArrayList<>(),0);
    return list;
    }
    void helper(int[] nums,List<List<Integer>> list,int tar,List<Integer> arr,int idx){
        if(tar<0){
            return;
        }else if(tar==0){
            list.add(new ArrayList<>(arr));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            arr.add(nums[i]);
            helper(nums,list,tar-nums[i],arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
}