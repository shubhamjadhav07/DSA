class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return new int[0][0];
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list= new ArrayList<>();
        int[] past=intervals[0];
        list.add(past);
        for(int i=1;i<intervals.length;i++){
            int[] next= intervals[i];
            if(next[0]<=past[1]){
                past[1]=Math.max(past[1],next[1]);
            }else{
                past=next;
                list.add(past);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}