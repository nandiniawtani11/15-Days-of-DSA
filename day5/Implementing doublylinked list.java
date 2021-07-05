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
	//display forward
	public void displayf()
	{
		if(head==null)
			return;
		ListNode current=head;
		while(current!=null)
		{
			System.out.print(current.data+"-");
			current=current.next;
		}
		
	}
	//insert At first
	public void insertf(int val)
	{
		ListNode node=new ListNode(val);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else {
			node.next=head;
			head.previous=node;
			head=node;
		}
	}
	//insert last
	public void insertlast(int val)
	{
		ListNode node=new ListNode(val);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			node.previous=tail;
			tail=node;
		}
	}
	public static void main(String[] args) {
		DoubleLinkList  dll = new DoubleLinkList ();
//		dll.insertf(1);
//		dll.insertf(3);
//		dll.insertf(5);
//		dll.insertf(10);
//		dll.insertf(12);
//		dll.displayf();
//		System.out.println();
		dll.insertlast(1);
		dll.insertlast(3);
		dll.insertlast(5);
		dll.insertlast(10);
		dll.insertlast(12);
		dll.displayf();
		
	}

}
