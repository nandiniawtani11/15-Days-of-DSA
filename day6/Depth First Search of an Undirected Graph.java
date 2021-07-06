	public void dfs(int s)
	{
		boolean visited[]=new boolean[V];
		Stack<Integer> stack=new Stack<>();
		stack.push(s);
		while(!stack.isEmpty())
		{
			int u=stack.pop();
			if(!visited[u])
			{
				visited[u]=true;
				System.out.print(u);
			
			for(int w:arr[u])
			{
				if(!visited[w])
				{
					stack.push(w);
				}
			}
			}
		}
		
	}
