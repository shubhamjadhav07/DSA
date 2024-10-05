class Solution {
    public String frequencySort(String s) {
        int[][] freqArray = new int[128][2]; // [0]: char (ASCII value), [1]: frequency

        // Step 2: Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            freqArray[c][0] = c;  // Store the character's ASCII value
            freqArray[c][1]++;    // Increment the frequency
        }

        // Step 3: Sort the frequency array by the frequency values in decreasing order
        Arrays.sort(freqArray, (a, b) -> b[1] - a[1]); // Sort by frequency in decreasing order

        // Step 4: Build the result string based on sorted frequencies
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < freqArray.length; i++) {
            int frequency = freqArray[i][1];
            if (frequency > 0) {  // Only consider characters that appear in the string
                for (int j = 0; j < frequency; j++) {
                    result.append((char) freqArray[i][0]);
                }
            }
        }

        return result.toString();
    }
}