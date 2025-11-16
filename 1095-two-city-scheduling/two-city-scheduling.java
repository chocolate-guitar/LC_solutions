class Solution {
    public int twoCitySchedCost(int[][] costs) {
        // Sort by the difference (costA - costB)
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));
        
        int n = costs.length / 2;
        int total = 0;

        // First N people -> City A
        for (int i = 0; i < n; i++) {
            total += costs[i][0];
        }

        // Last N people -> City B
        for (int i = n; i < 2 * n; i++) {
            total += costs[i][1];
        }

        return total;
    }
}
