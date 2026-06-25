class Solution {
    public boolean hasDuplicate(int[] nums) {
        var mySet = new HashSet<Integer>();
        for(int i:nums){
            mySet.add(i);
        }
        return mySet.size()!=nums.length;
    }
}