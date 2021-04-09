class MajorityChecker {
    private int[] arr;
    public MajorityChecker(int[] arr) {
        this.arr = arr;
    }
    
    public int query(int left, int right, int threshold) {
        int[] subArray = Arrays.copyOfRange(this.arr, left, right+1);
        
        return checkMajorityElement(subArray,threshold);
    }
    
    public int checkMajorityElement(int array[], int threshold){
        
        int n = array.length;
        int major = array[0];
        int count = 1;
        for(int i=1; i<n; i++){
            if(array[i]==major)
                count++;
            else
                count--;
            if(count == 0){
                major = array[i];
                count = 1;
            }
            
        }
        count=0;
        for(int i:array)
            if(i==major)
                count++;
        
        if(count>=threshold)
            return major;
        return -1;
    }
}

/**
 * Your MajorityChecker object will be instantiated and called as such:
 * MajorityChecker obj = new MajorityChecker(arr);
 * int param_1 = obj.query(left,right,threshold);
 */