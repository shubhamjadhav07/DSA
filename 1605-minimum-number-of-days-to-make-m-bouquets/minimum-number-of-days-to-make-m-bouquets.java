class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start=Integer.MAX_VALUE,end=0,ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            start=Math.min(start,bloomDay[i]);
            end=Math.max(end,bloomDay[i]);
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int curr=0,count=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    curr++;
                    if(curr==k){
                        count++;
                        curr=0;
                    }
                }else{
                    curr=0;
                }
            }
            if(count>=m){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    
}