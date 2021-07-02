package dsa;

public class binaryTree1 {
	private TreeNode root;
	public static class TreeNode
	{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}	
	}
	public void preOrder(TreeNode root)
	{
		if(root==null)
			return;
		System.out.print(root.data+"-");
		preOrder(root.left);
		preOrder(root.right);
	}
	public void inOrder(TreeNode root)
	{
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.print(root.data+"-");
		inOrder(root.right);
	}
	public void postOrder(TreeNode root)
	{
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+"-");
	}
	public void createTree()
	{
		TreeNode first=new TreeNode(10);
		TreeNode second=new TreeNode(20);
		TreeNode third=new TreeNode(30);
		TreeNode forth=new TreeNode(40);
		root=first;
		root.left=second;
		root.right=third;
		second.left=forth;
		preOrder(root);
		System.out.println();
		inOrder(root);
		System.out.println();
		postOrder(root);
	}
	public static void main(String[] args)
	{
		binaryTree1 tree=new binaryTree1();
		tree.createTree();
		
	}

}
