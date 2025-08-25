class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) return "";

        char[] prefix = strs[0].toCharArray();  // corrected: add parentheses for method call

        for (int i = 1; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            int j = 0;
            // corrected from prefix[i] to prefix[j]
            while (j < prefix.length && j < word.length && prefix[j] == word[j]) {  
                j++;
            }

            char[] newPrefix = new char[j];
            for (int k = 0; k < j; k++) {
                newPrefix[k] = prefix[k];
            }
            prefix = newPrefix;

            if (prefix.length == 0) return "";
        }
        return new String(prefix);
    }
}