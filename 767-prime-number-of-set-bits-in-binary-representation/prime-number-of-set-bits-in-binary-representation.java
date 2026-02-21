class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;

        for (int i = left; i <= right; i++) {
            int count = Integer.bitCount(i);  // counts 1s in binary
            if (isPrime(count)) {
                ans++;
            }
        }

        return ans;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}