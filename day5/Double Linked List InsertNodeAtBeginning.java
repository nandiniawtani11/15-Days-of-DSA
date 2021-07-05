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
