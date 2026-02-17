class Solution {
    public int bestClosingTime(String c) {
        int pen = 0;
        int minPen = 0;
        int idx = c.length();
        int n = c.length();

        for(int i = n-1; i>=0; i--){
            if(c.charAt(i)=='Y') pen++;
            else pen--;
            if(minPen>=pen){
                minPen = pen;
                idx = i;
            }
        }
        return idx;
    }
}