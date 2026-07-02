class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int prod = 1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                prod*=nums[i];
            }
            else{
                zeroCount++;
            }
        }
        if(zeroCount>1){
            return new int[n];
        }
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            if(zeroCount==1){
                if(nums[i]==0){
                    result[i]=prod;
                }
            }
              else{
                    result[i]=prod/nums[i];
                }
        }
        return result;
        
    }
}  
