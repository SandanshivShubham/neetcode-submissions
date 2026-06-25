class Solution {
    public int[] twoSum(int[] nums, int target) {
        var myMap = new HashMap<Integer, Integer>();

        for(int i=0;i<nums.length;i++){
            var remainingValue = target-nums[i];
            if(myMap.containsKey(remainingValue) && myMap.get(remainingValue)!=i){
                return new int[]{myMap.get(remainingValue), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
