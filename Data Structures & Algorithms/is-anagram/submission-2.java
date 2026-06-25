class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length()!=t.length()){
      return false;
    }

      int frequencyArray [] = new int[26];
      for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        frequencyArray[(int) c - 97]++;
      }
       for(int i=0;i<t.length();i++){
        char c = t.charAt(i);
        frequencyArray[(int) c - 97]--;
      }
      for(int i:frequencyArray){
        if(i!=0){
            return false;
        }
      }
      return true;

    
    }
}
