class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> myMap = new HashMap<>();
    
        for(int i=0;i<strs.length;i++){
            int [] frequency = new int[26];
            StringBuilder sb = new StringBuilder();
            String s = strs[i];
            for(int k=0;k<s.length();k++){
                frequency[s.charAt(k)-'a']++;
            }
            for(int nums:frequency){
                sb.append("$");
                sb.append(nums);
            }
            // myMap.putIfAbsent(sb.toString(), new ArrayList<>());
            // myMap.get(sb.toString()).add(s);
            myMap.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(myMap.values());

    }
}
