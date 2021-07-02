static SinglyLinkedListNode jump(SinglyLinkedListNode head,int k)
     {
         while(k-->0)
         {
             head=head.next;
         }
         return head;
     }
     static int size(SinglyLinkedListNode head)
     {
         if(head==null)
         {
             return 0;
         }
         int count=0;
         while(head!=null)
         {
             count=count+1;
             head=head.next;
         }
         return count; 
     }
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int a=size(head1);
        int b=size(head2);
        if(a>b)
        {
            head1=jump(head1,a-b);
        }
        if(b>a)
        {
            head2=jump(head2,b-a);
        }
        while(head1!=null)
        {
            if(head1==head2)
            {
                return head1.data;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return 0;

    }
