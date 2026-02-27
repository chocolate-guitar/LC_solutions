class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (isVowel(sb.charAt(left)) && isVowel(sb.charAt(right))) {

                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);

                left++;
                right--;
            }
            else if (!isVowel(sb.charAt(left))) {
                left++;
            }
            else {
                right--;
            }
        }

        return sb.toString();
    }

    private Boolean isVowel(char c){
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')return true;
        return false;
    }
}