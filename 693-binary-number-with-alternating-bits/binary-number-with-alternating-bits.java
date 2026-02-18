class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevRem = n%2;        
        n=n/2;

        while(n>0){
            int rem = n%2;
            if(rem==prevRem) return false;
            prevRem = rem;
            n/=2; 
        }
        return true;
    }
}