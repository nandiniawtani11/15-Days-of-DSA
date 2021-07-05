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
