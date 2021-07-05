   public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    DoublyLinkedListNode node=new DoublyLinkedListNode(data);
    DoublyLinkedListNode current=llist;
    while(current.next!=null)
    {
        current=current.next;
    }
    if(data<llist.data)
    {
        node.next=llist;
        llist.prev=node;
        llist=node;
        return llist;
    }
    else if(data>current.data)
    {
        node.prev=current;
        current.next=node;
        return llist;
    }
    
    current=llist;
    DoublyLinkedListNode pre=current;
    while(current!=null)
    {
        if(current.data>data)
        {
            current.prev=node;
            node.next=current;
            pre.next=node;
            node.prev=pre;
            break;
        }
        pre=current;
        current=current.next;
    }
    return llist;
    
