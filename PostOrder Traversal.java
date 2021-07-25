class Solution {
    public  List<Integer> list=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
            if(root==null)
            {
                if(list.size()==0)
                    return list;
                return null;
            }
            
            postorderTraversal(root.left);
        
            postorderTraversal(root.right);
        list.add(root.val);
            return list;
    }
}
