class Solution {
    public String frequencySort(String s) {
        int[][] nums= new int[128][2];
        for(char ch:s.toCharArray()){
            nums[ch][0]= ch;
            nums[ch][1]++;
        }
        Arrays.sort(nums,(a,b)->b[1]-a[1]);
        StringBuilder str= new StringBuilder();
        for(int i=0;i<128;i++){
            int freq= nums[i][1];
            for(int j=freq-1;j>=0;j--){
                str.append((char)nums[i][0]);
            }
        }
        return str.toString();
    }
}