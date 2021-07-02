	//length of linked list
	public int length()
	{
		if(head==null)
			return 0;
		ListNode current=head;
		int count=0;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;		
	}


