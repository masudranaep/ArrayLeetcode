Input:[1,2,0,1,1,1]
output:3
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cunnent_nums = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cunnent_nums += 1;
                max = Math.max(max, cunnent_nums);
                
            }else{
              cunnent_nums = 0;  
            }
        }
        return max;
    }
}