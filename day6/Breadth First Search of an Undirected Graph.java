package dsa;
import java.util.LinkedList;
import java.util.Queue;
public class NewGraph {
	private int V;
	private int E;
	private LinkedList<Integer>[] arr;
	public NewGraph(int v)
	{
		this.V=v;
		this.E=0;
		this.arr=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			arr[i]=new LinkedList<>();
		}
	}
	public void addEdge(int n,int k)
	{
		arr[n].add(k);
		arr[k].add(n);
		E++;
	}
	public String toString()
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<V;i++)
		{
			for(int w:arr[i])
			{
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
		
	}
	public void bfs(int s)
	{
		boolean[] visited=new boolean[V];
		Queue<Integer> q=new LinkedList<>();
		visited[s]=true;
		q.offer(s);
		while(!q.isEmpty())
		{
			int w=q.poll();
			System.out.print(w);
			for(int h:arr[w])
			{
				if(!visited[h])
				{
					visited[h]=true;
					q.offer(h);
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		NewGraph g = new NewGraph(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.bfs(0);	

}
}
