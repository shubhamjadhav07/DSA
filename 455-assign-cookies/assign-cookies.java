class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j=0;
        for(int i=0;i<g.length;i++){
            int child=g[i];
            while(j<s.length){
                if(child<=s[j]){
                    count++;
                    s[j]=-1;
                    break;
                }
                j++;
            }
        }  
        return count; 
    }
}