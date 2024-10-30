class Solution {
    public int candy(int[] ratings) {
        int[] left=new int[ratings.length];
        left[0]=1;
        for(int i=1;i<left.length;i++){
            if(ratings[i-1]>=ratings[i]){
                left[i]=1;
            }else{
                left[i]=left[i-1]+1;
            }
        }
        int count=left[left.length-1];
        for(int i=left.length-2;i>=0;i--){
            if(ratings[i+1]>=ratings[i]){
                left[i]=Math.max(left[i],1);
                count+=left[i];
            }else{
                left[i]=Math.max(left[i+1]+1,left[i]);
                count+=left[i];
            }
        }
        return count;
    }
}