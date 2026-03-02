class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int curr = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curr++;
            }
        }

        max = curr;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) curr++;
            if (isVowel(s.charAt(i - k))) curr--;
            max = Math.max(max, curr);
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}