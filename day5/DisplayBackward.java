public void displayBackward()
	{
		if(head==null)
		{
			return;
		}
		ListNode temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.previous;			
		}
		System.out.print("null");		
	}
