class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        //frequency
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        //sorting by frequency
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        //result
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(String.valueOf(c).repeat(freq.get(c)));
        }

        return sb.toString();
    }
}
