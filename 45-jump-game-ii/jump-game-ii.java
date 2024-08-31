class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int max=0;
        int curr_max=0;
        int count=0;
        int r=0;
        int l=0;
        while(r<=nums.length-1){
            for(int i=l;i<=r;i++){
                curr_max=i+nums[i];
                if(max<curr_max){
                    max=curr_max;
                }
                if(max>=nums.length-1){
                    return count+1;
                }
            }
            count++;
            l=r+1;
            r=max;

        }
        return count;
    }
}