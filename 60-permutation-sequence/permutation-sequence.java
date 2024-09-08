class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n];
        
        
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;  
            factorial[i - 1] = fact;
        }
        
        k--;
        
        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 0; i--) {
            fact /= i;  
            int index = k / fact;  
            sb.append(numbers.get(index));  
            numbers.remove(index);  
            k %= fact;  
        }
        
        return sb.toString();
    }
}