class Solution {
    public  List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
         if(root==null)
            {
                if(list.size()==0)
                    return list;
                return null;
            }
            
            inorderTraversal(root.left);
        list.add(root.val);
            inorderTraversal(root.right);
            return list;
    }
}
