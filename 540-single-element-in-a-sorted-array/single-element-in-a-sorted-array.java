class Solution {
    public int singleNonDuplicate(int[] nums) {
        int count=nums[0];
        for(int i=1;i<nums.length;i++){
            count=count^nums[i];
        }
        return count;
    }
}