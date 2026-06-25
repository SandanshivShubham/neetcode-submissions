class Solution {
    public boolean hasDuplicate(int[] nums) {
        var mySet = new HashSet<Integer>();
        for(int i:nums){
            if(mySet.contains(i)){
                return true;
            }
            mySet.add(i);
        }
        return false;
    }
}