class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> myMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s= strs[i];
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            if(myMap.get(newStr)!=null){
               myMap.get(newStr).add(s);
            }
            else{
                myMap.put(newStr, new ArrayList<>(List.of(s)));
            }
        }
        return new ArrayList<>(myMap.values());
    }
}
