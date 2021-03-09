class Solution {
    public List<String> summaryRanges(int[] nums) {
     List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        int start = 0;
        int end = 0;
        for(int i = 1; i < nums. length; i++){
            if(nums[i] != nums[i -1] + 1){
                end = i -1;
                if(start != end) result.add(nums[start] + "->" + nums[end]);
                else 
                    result.add(nums[end] + "");
                start = i;
            }
        }
                end = nums.length -1;
                if(start != end)
                    result.add(nums[start] + "->" + nums[end]);
        else
            result.add(nums[end] + "");
        return result;

    }
}