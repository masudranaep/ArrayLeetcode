  public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        if(matrix.length == 0) return res;
        int rowB = 0;
        int rowEnd = matrix.length -1;
        int columnB = 0;
        int columnEnd = matrix[0].length - 1;
        
        while(rowB <= rowEnd && columnB <= columnEnd){
            for(int i = columnB; i <= columnEnd; i++){
                res.add(matrix[rowB][i]);
           }
            rowB++;
            for(int i = rowB; i <= rowEnd; i++){
                res.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            if(rowB <= rowEnd){
                for(int i = columnEnd; i >= columnB; i--){
                    res.add(matrix[rowEnd][i]);
                 }
            }
            rowEnd--;
            if(columnB <= columnEnd){
                for(int i = rowEnd; i >= rowB; i--){
                   res.add(matrix[i][columnB]);
                }
            }
         columnB++;
        }
        return res;
    }