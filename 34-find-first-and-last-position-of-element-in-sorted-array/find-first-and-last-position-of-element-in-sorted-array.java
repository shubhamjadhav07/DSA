class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int[] ans= new int[2];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                int n=mid;
                int p=mid;
                while(n>=0 &&nums[n]==target ){
                    n--;
                }
                while( p<nums.length && nums[p]==target ){
                    p++;
                }
                ans[0]=n+1;
                ans[1]=p-1;
                return ans;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}