public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
    // Write your code here
    SinglyLinkedListNode current=llist;
    if(position==0)
    {
        llist=llist.next;
        current.next=null;
        return llist;
    }
    SinglyLinkedListNode previous=null;
    while(position-->0)
    {
        previous=current;
        current=current.next;
    }
    previous.next=current.next;
    current.next=null;
    return llist;
    }
