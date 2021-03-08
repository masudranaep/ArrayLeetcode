    public double findMaxAverage(int[] nums, int k) {
       int wind = 0;
        double  sum = 0,maxSum = Double.NEGATIVE_INFINITY;
        for( int windEnd = 0; windEnd < nums.length; windEnd++){
            sum = sum + nums[windEnd];
            if((windEnd  - wind + 1) == k){
                if(sum > maxSum){
                    maxSum = sum;
                }
                sum = sum - nums[wind];
                wind++;
            }
        }
        return maxSum/k;
    }
}