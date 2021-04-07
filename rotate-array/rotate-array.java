class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i < k; i++)
            rotateByOne(nums);
    }
    private void rotateByOne(int[] arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
}