class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int count = 0;
        HashMap<Integer,Integer> prefixSums = new HashMap<>();
        prefixSums.put(0,1);
        for(int n: nums){
            currSum += n;
            if(prefixSums.containsKey(currSum-k)){
                count+=prefixSums.get(currSum-k);
            }
            prefixSums.put(currSum, prefixSums.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}