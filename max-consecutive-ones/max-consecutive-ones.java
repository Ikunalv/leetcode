class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,global_max=0;
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            if(nums[i]==1)
                max+=1;
            else{
                if(max>global_max)
                    global_max = max;
                max=0;
            }
            if(max>global_max)
                    global_max = max;
        }
        
        return global_max;
    }
}