class Solution {
    public int jump(int[] nums) {
        int l=0;
        int r=0;
        int max=0;
        int currMax=0;
        int count=0;
        while(r<nums.length-1){
            for(int i=l;i<=r;i++){
            currMax=i+nums[i];
            max=Math.max(max,currMax);
            if(max>=nums.length-1) return count+1;
            }
            count++;
            l=r+1;
            r=max;
        }
    return count;
    }
}