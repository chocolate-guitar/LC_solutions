class Solution {
    public String convert(String s, int numRows) {

        // Special case
        if (numRows == 1) {
            return s;
        }

        String[] rows = new String[numRows];

        // Initialize rows
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int row = 0;
        boolean down = true;

        for (int i = 0; i < s.length(); i++) {

            rows[row] += s.charAt(i);

            // Change direction at top/bottom
            if (row == numRows - 1) {
                down = false;
            } 
            else if (row == 0) {
                down = true;
            }

            // Move row pointer
            if (down) {
                row++;
            } else {
                row--;
            }
        }

        // Combine all rows
        String ans = "";

        for (String str : rows) {
            ans += str;
        }

        return ans;
    }
}