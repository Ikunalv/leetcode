class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        int rows = matrix.length;
        for (int[] row : matrix) {
            reverse(row);
        }
    }
    public void transpose(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int row=0; row < rows; row++){
            for(int column=0; column < columns; column++){
                //System.out.println("row="+row+",column="+column);
                if(row==column)
                    continue;
                if(column<row){
                    int temp = matrix[row][column];
                    matrix[row][column] = matrix[column][row];
                    matrix[column][row] = temp;
                }else
                    continue;
            }
        }

    }
    void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while( start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}