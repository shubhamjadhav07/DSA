class Solution {
    public int findComplement(int num) {
        int bit_length=Integer.toBinaryString(num).length();
        int mask= (1<<bit_length)-1;
        return num^mask;
    }
}