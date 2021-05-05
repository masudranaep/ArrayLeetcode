class Solution {
    public int arrayNesting(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(i)){
                int j = i;
                int count = 0;
                while(!set.contains(j)){
                    set.add(j);
                    j = nums[j];
                    count++;
                }
                if(count > maxCount)
                    maxCount = count;
            }
        }
        return maxCount;
    }
}