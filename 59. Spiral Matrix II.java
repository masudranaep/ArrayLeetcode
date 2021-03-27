    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int rowB = 0;
        int rowEnd = n -1;
        int columnB = 0;
        int columnEnd = n -1;
        int counter = 1;
        
        while(rowB <= rowEnd && columnB <= columnEnd){
            for(int i = columnB; i <= columnEnd; i++){
                res[rowB][i] = counter++;
}
            rowB++;
        for(int i = rowB; i <= rowEnd; i++){
            res[i][columnEnd] = counter++;
}
           columnEnd--;
            if(rowB <= rowEnd){
                for(int i = columnEnd; i >= columnB; i--){
                    res[rowEnd][i] = counter++;
}
}
           rowEnd--;
            if(columnB <= columnEnd){
                for(int i = rowEnd; i >= rowB; i--){
                    res[i][columnB] = counter++;
                }
}
            columnB++;
       }
        return res;
    }
}