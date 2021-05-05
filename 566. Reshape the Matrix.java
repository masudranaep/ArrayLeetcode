 public int[][] matrixReshape(int[][] nums, int r, int c){
     int rows = nums.length;
     int columns = nums[0].length;
     
     if((rows * columns) != (r * c)) return nums;
     int[][] output_arr = new int[r][c];
     int row_num = 0;
     int columns_num = 0;
     
     for (int i = 0; i < rows; i++) {
         for (int j = 0; j < columns; j++) {
            output_arr[row_num][columns_num] = nums[i][j];
            columns_num++;
            if(columns_num == c){
                columns_num = 0;
                row_num++;
            }
         }
     }
     return output_arr;
 }

}
