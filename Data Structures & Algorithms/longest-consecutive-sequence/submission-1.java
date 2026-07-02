class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int result = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int number = nums[i];
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]-1==number){
                    number=nums[j];
                    count++;
                }
                result=Math.max(result, count);
            }
        }
        return result;
    }
}
