//insert node at beginning
	public void insertFirst(int val)
	{
		ListNode node=new ListNode(val);
		if(head==null)
			head=node;
		else
		{
			node.next=head;
			head=node;
		}
			
	}
