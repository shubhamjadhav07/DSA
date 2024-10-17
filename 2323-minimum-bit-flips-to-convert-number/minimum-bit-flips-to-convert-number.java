class Solution {
    public int minBitFlips(int start, int goal) {
        int count=0;
        int num=start ^ goal;
        int mask=1;
        for(int i=0;i<32;i++){
            if((mask & num)!=0){
                count++;
            }
           num=num>>1;
        }
        return count;
    }
}