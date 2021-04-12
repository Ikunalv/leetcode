class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int missingNo = 0;
        for(int i=1; i < nums.length; i++){
            if(nums[i]-nums[i-1]>1){
                missingNo = nums[i]-1;
                break;
            }
        }
        if(missingNo!=0)
            return missingNo;
        if(nums[0]==0)
        return nums[nums.length-1]+1;
        return 0;
    }
}