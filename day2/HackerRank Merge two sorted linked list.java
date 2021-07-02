 static SinglyLinkedListNode insert(SinglyLinkedListNode head3,int val)
     { 
        
        SinglyLinkedListNode node=new SinglyLinkedListNode(val);
        if(head3==null)
        {
            head3=node;
            return head3;
        } 
        SinglyLinkedListNode current=head3;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=node;
        return head3;
        
     }
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head3=null;        
        SinglyLinkedListNode current1 =head1;
        SinglyLinkedListNode current2 =head2;
        while(current1!=null && current2!=null)
        {
            
            if(current1.data<current2.data)
            {
               head3= insert(head3,current1.data);
                current1=current1.next;  
            }
            else
            {
                head3=insert(head3,current2.data);
                current2=current2.next; 
            }
        }
        while(current1!=null)
        {
            head3= insert(head3,current1.data);
            current1=current1.next;
        }
         while(current2!=null)
        {
           head3= insert(head3,current2.data);
            current2=current2.next;
        }
        return head3;
    }
