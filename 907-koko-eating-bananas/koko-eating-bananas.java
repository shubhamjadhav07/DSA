class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=0;
        for(int i=0;i<piles.length;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        int start=1;
        int last=maxi;
        while(start<=last){
            int mid= start+(last-start)/2;
            int total= check(piles, mid);
            if(total<=h){
                last=mid-1;
            }
            else if(total>h){
                start=mid+1;
            }
        }
         return start;
    }
    public int check(int[] piles, int k){
        if(k==0) return 0;
        int i=0;
        int h=0;
        while(i<piles.length){
            h+=Math.ceil((double)piles[i]/k);
            i++;
        }
        return h;
    }
}