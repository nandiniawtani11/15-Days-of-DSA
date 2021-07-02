//insert node at given position
	public void insertAtPosition(int pos,int val)
	{
		ListNode node=new ListNode(val);
		if(pos==0)
		{
			node.next=head;
			head=node;
			return;
		}
		ListNode current=head;
		while(pos-->1)
		{
			current=current.next;
		}
		ListNode pr=current.next;
		current.next=node;
		node.next=pr;
	}
