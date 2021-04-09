class Solution {
    public int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; ++i) {
      int num = numbers[i];

     // Find the number and return its index.
	 // If failed to find it, returned index will be -1 
      int index = binarySearch(numbers, target-num, i + 1);
      if (index > -1) {
        return new int[]{i+1, index+1};
      }
    }
    return new int[]{};
  }

  private int binarySearch(int[] numbers, int numToFind, int startIndex) {
    int left = startIndex;
    int right = numbers.length - 1;
    int mid;
	
    while(left <= right) {
      mid = (left + right) / 2;
      if (numbers[mid] < numToFind) {
        left = mid + 1;
      } else if (numbers[mid] > numToFind) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}