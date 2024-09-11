class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int num1= (coordinate1.charAt(0)-'a')+(coordinate1.charAt(1)-'0');
        int num2=(coordinate2.charAt(1)-'0')+(coordinate2.charAt(0)-'a');
        return num1%2==num2%2;
    }
}