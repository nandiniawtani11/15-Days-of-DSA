public static  SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    SinglyLinkedListNode node=new SinglyLinkedListNode(data);
    if(position==0)
        {
            node.next=llist;
            llist=node;
            return llist;
        }
         SinglyLinkedListNode current=llist;
        while(position-->1)
        {
            current=current.next;
        }
        SinglyLinkedListNode pr=current.next;
        current.next=node;
        node.next=pr;
        return llist;

    }
