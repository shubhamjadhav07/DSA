class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        int count=0;
        boolean[] num=new boolean[n];
        for(int i=0;i<n;i++){
            num[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(num[i]){
                for(int j=i*i;j<n;j+=i){
                    num[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(num[i]) count++;
        }
        return count;
    }
}