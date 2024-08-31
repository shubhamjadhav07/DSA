class Solution {
    public boolean canJump(int[] nums) {
        int farthest=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(i>farthest){
                return false;
            }
            curr=i+nums[i];
            if(farthest<curr){
                farthest=curr;
            }
        }
        return true;
    }
}