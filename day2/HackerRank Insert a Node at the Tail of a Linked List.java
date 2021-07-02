 static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node=new SinglyLinkedListNode(data);
        if(head==null)
        {
            head=node;
            return head;
        }
        SinglyLinkedListNode current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=node;  
        return head;     
    }
