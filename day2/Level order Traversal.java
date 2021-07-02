	public void levelOrder(TreeNode root)
		{
			Queue<TreeNode> q=new LinkedList<TreeNode>();
			q.add(root);
			TreeNode temp=null;
			while(!q.isEmpty())
			{
				temp=q.peek();
				q.remove();
				System.out.print(temp.data +"-");
				if(temp.left!=null)
					q.add(temp.left);
				if(temp.right!=null)
					q.add(temp.right);
				
			}
		}
