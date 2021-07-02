static int length(SinglyLinkedListNode head)
    {
        if(head==null)
            return 0;
         SinglyLinkedListNode current=head;
        int count=0;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;    
    }
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        if(length(head1)!=length(head2))
        {
            return false;
        }
        SinglyLinkedListNode current1=head1;
        SinglyLinkedListNode current2=head2;
        while(current1!=null)
        {
            if(current1.data!=current2.data)
            {
                return false;
            }
            current1=current1.next;
            current2=current2.next;   
        }
        return true;
    }
