	public void insertAtpos(int val,int pos)
	{
		ListNode node=new ListNode(val);
		if(pos==0)
			insertf(val);
		else
		{
			ListNode current=head;
			int i=0;
			while(i<pos-1)
			{
				current=current.next;
				i++;
			}
			ListNode temp=current.next;
			current.next=node;
			node.previous=current;
			temp.previous=node;
			node.next=temp;			
		}
				
	}
