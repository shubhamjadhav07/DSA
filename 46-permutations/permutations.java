class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr= new ArrayList<>();
        List<Integer> arr1= new ArrayList<>();
        boolean[] check= new boolean[nums.length];
        helper(arr,arr1,nums,check);
        return arr;
    }
    void helper(List<List<Integer>> arr,List<Integer> arr1,int[]nums ,boolean[] check){
        if(arr1.size()==nums.length){
            arr.add(new ArrayList<>(arr1));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                check[i]=true;
                arr1.add(nums[i]);
                helper(arr,arr1,nums,check);
                arr1.remove(arr1.size()-1);
                check[i]=false;
            }
        }
    }
}