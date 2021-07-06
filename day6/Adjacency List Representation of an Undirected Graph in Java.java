package dsa;
import java.util.LinkedList;
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
	public static void main(String[] args) {
		NewGraph g = new NewGraph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);	

}
}
