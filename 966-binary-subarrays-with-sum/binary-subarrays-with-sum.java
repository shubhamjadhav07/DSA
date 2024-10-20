class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        for(int i =0;i<nums.length;i++){
            int counts=nums[i];
            int j;
            if(nums[i]==0 ){
                j=i;
            }
            else{
                j=i+1;
            }
            while(j<nums.length){
                
                
                if(counts<=goal){
                 counts=counts+nums[j];
                }
                else{
                    break;
                }
                if(counts==goal){
                    count++;
                    
                }
                j++;
            }
        }
        if(goal==1&&nums[0]==1){
            count++;
        }
        return count;
    }
}