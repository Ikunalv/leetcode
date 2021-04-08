class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int productRight = 1;
        for(int i = nums.length-1; i>=0; i--){
            result[i] = productRight;
            productRight = productRight * nums[i];
        }
        int productLeft = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = productLeft * result[i];
            productLeft = productLeft * nums[i];
        }
        return result;
    }
}