package dsa;
public class DoubleLinkList {
	private ListNode head;
	private ListNode tail;
	private int length;
	public class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;
		ListNode(int data)
		{
			this.data=data;
		}
	}
	public DoubleLinkList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public int length()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0; 
	}

}
