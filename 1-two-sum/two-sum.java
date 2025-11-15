class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int sol[]=new int[2];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    sol[0]=i;
                    sol[1]=j;
                    break;
                    //
                }
            }
        }
        return sol;
    }
}