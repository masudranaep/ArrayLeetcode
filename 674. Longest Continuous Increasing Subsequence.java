   public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int acho = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i-1] >= nums[i]) acho = i;
            result = Math.max(result, i - acho + 1);
        }
        return result;
    }
}