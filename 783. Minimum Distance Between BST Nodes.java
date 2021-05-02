    public int minDiffInBST(TreeNode root) {
      if(root == null) return 0;
        ListInteger list = new ArrayListInteger();
        InOrderTravesal(root, list);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i  list.size() -1; i++){
            minDiff = Math.min(minDiff, list.get(i + 1) - list.get(i));
        }
        return minDiff;
    }
    private void InOrderTravesal(TreeNode root, ListInteger list){
        if(root == null) return;
        InOrderTravesal(root.left, list);
        list.add(root.val);
        InOrderTravesal(root.right,list);
    }
