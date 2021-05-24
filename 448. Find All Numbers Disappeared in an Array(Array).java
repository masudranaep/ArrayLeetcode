input:[4,3,2,7,8,3,1]
output:[5,6]
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNum = new ArrayList<Integer>();
        HashSet<Integer> number = new HashSet<Integer>();
        for(int i : nums){
            number.add(i);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!number.contains(i)){
                missingNum.add(i);
            }
        }
        return missingNum;
    }
}