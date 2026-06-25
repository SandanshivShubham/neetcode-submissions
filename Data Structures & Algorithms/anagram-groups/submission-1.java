class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> myMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s= strs[i];
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            
            myMap.putIfAbsent(newStr, new ArrayList<>());
            myMap.get(newStr).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}
