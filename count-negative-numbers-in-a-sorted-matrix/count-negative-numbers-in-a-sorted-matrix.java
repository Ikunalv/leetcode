class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        
        for(int[] row:grid){
            for(int column:row){
                if(column<0)
                    sum++;
            }
        }
        return sum;
    }
}