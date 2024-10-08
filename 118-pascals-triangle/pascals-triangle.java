class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        list.add(temp);
        for(int i=1;i<numRows;i++){
            List<Integer> prev=list.get(i-1);
            List<Integer> curr= new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            list.add(curr);
        }
        return list;
    }
}