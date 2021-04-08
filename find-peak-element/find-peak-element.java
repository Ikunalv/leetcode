class Solution {
    public int findPeakElement(int[] nums) {
       
        return binarySearch(nums,0,nums.length-1);
    }
    public int binarySearch(int[] arr, int start, int end){
       
        if(start == end)
            return start;
        int middle = start + (end - start)/2;
        
        if( arr[middle]>arr[middle+1])
            return binarySearch(arr,start,middle);
        else 
            return binarySearch(arr,middle+1,end);
       
    }
}