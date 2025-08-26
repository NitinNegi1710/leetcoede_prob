import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // if lengths differ, they can't be anagrams
        if (s.length() != t.length()) return false;

        // convert to char arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare
        return Arrays.equals(arr1, arr2);
    }
}
