class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        
        int i=0,j=n,k=0;
        while(k<nums.length){
            result[k]=nums[i];
            result[k+1] = nums[j];
            i++;
            j++;
            k+=2;
        }
        return result;
    }
}