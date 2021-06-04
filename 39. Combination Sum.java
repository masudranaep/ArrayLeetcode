    private void findCombination(int ind, int[] array, int target, List<List<Integer>> ans, List<Integer> ds){
if(ind == array.length){
    if(target == 0){
        ans.add(new ArrayList<>(ds));
        
    }
    return;
}
        if(array[ind] <= target){
            ds.add(array[ind]);
            findCombination(ind, array, target - array[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(ind +1, array, target, ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}