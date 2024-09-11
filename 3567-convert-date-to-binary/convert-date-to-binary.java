class Solution {
    public String convertDateToBinary(String date) {
        String year= date.substring(0,4);
        String month=date.substring(5,7);
        String day= date.substring(8,10);
        StringBuilder sb= new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(year)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(month)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(day)));
        return sb.toString();
    }
}