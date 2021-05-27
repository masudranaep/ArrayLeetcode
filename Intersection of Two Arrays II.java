 public int[] intersect(int[] nums1, int[] nums2) {
       List<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < nums1.length; i++){
             if(map1.containsKey(nums1[i]))
                 map1.put(nums1[i], map1.get(nums1[i]) +1);
            else
                map1.put(nums1[i], 1);
        }
        for(int i = 0; i < nums2.length; i++){
            if(map2.containsKey(nums2[i]))
                map2.put(nums2[i], map2.get(nums2[i]) +1);
            else
                map2.put(nums2[i], 1);
        }
        for( Integer key : map1.keySet()){
            if(map2.containsKey(key)){
                int x = Math.min(map2.get(key), map1.get(key));
                while(x --> 0){
                  arr.add(key);
                }
            }
        }
        int res[] = new int[arr.size()];
           for(int i = 0; i < arr.size();i++)
            res[i] = arr.get(i);
        return res;
            
    }
}