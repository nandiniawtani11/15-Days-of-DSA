static SinglyLinkedListNode head3=null;
      static SinglyLinkedListNode tail3=null;
     static void insert(int val)
     { 
         if(head3==null)
         {
             head3=new SinglyLinkedListNode(val);
             tail3=head3;
         }
         else
         {
             SinglyLinkedListNode node=new SinglyLinkedListNode(val);
             tail3.next=node;
             tail3=node;
         }
     }
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode current1 =head1;
        SinglyLinkedListNode current2 =head2;
        while(current1!=null && current2!=null)
        {
            if(current1.data==current2.data)
            {
                insert(current1.data);
                insert(current2.data);
                current1=current1.next;
                current2=current2.next;
            }
            else if(current1.data<current2.data)
            {
                insert(current1.data);
                current1=current1.next;  
            }
            else
            {
                insert(current2.data);
                current2=current2.next; 
            }
        }
        while(current1!=null)
        {
            insert(current1.data);
            current1=current1.next;
        }
         while(current2!=null)
        {
            insert(current2.data);
            current2=current2.next;
        }
        return head3;
    }
