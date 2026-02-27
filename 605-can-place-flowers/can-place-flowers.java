class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int zeros = 1; // virtual 1 at start
        
        for (int flower : flowerbed) {
            if (flower == 0) {
                zeros++;
            } else {
                count += (zeros - 1) / 2;
                zeros = 0;
            }
        }
        
        zeros++; // virtual 1 at end
        count += (zeros - 1) / 2;
        
        return count >= n;
    }
}