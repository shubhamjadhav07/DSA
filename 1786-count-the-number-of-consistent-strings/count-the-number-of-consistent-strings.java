class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr= new int[26];
        for(char i:allowed.toCharArray()){
            arr[i-'a']=1;
        }
        int count=0;
        for(String k:words){
            count+= count(arr,k);
        }
        return count;
    }
    int count(int[] arr, String str){
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==0){
                return 0;
            }
        }
        return 1;
    }
}