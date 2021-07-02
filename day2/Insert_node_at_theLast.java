	//insert node at last
	public void insertLast(int val)
	{
		ListNode node=new ListNode(val);
		if(head==null)
			head=node;
		ListNode current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=node;
	
	}
