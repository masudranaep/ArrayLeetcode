   public static void main(String[] args) {
        int[] nums = new int[] {2,3,4,5,7};
        int target = 7;
        int[] result = getTwoSum(nums, target);
        System.out.print( result[0] + " " + result[1]);
        System.out.println();
                    
        
    }
    public static int[] getTwoSum(int[] nums, int target ){
    Map<Integer, Integer> visitNum = new HashMap<>();  
    for(int i = 0; i < nums.length; i++){
        int delta = target - nums[i];
        if(visitNum.containsKey(delta)){
            return new int[]{i, visitNum.get(delta)};
        }
        visitNum.put(nums[i], i);
    }
    return new int[]{-1,-1};
    
    }
    