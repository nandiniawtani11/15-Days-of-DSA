package dsa;


public class SingleList {
	private ListNode head;
	private static class ListNode{
		private ListNode next;
		private int data;
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void display()
	{
		if(head==null)
			return;
		ListNode current=head;
		while(current.next!=null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print(current.data);
	}
	public static void main(String[] args)
	{
		SingleList sll=new SingleList ();
		sll.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		ListNode five=new ListNode(20);
		ListNode sixth=new ListNode(5);
		ListNode seventh=new ListNode(25);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=five;
		five.next=sixth;
		sixth.next=seventh;
		sll.display();
	}

}
