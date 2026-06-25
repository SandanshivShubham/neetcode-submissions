class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> mySet = new HashSet<>(nums);
        Set<Integer> mySet = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());
        return mySet.size()!=nums.length;
    }
}