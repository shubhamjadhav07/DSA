class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strs[0];

        // Iterate over the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Adjust the prefix by comparing it with each string
            while (strs[i].indexOf(prefix) != 0) {
                // Trim the prefix by one character until a match is found
                prefix = prefix.substring(0, prefix.length() - 1);

                // If no common prefix is found, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}