class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int n = s.length();
        int freq=1;
        List<Integer> cList= new ArrayList<>();

        for(int i=1; i<n; i++){
            if(s.charAt(i)==s.charAt(i-1)) freq++;
            else{
                cList.add(freq);
                freq = 1;
            }
        }
        cList.add(freq);

        for(int i = 0; i<cList.size()-1; i++){
            count += Math.min(cList.get(i),cList.get(i+1));
        }
        return count;
    }
}