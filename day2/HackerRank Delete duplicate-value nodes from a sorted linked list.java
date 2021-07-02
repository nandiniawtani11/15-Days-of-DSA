//remove result class  
public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
    if(llist.next==null)
    {
        return llist;
    }
    SinglyLinkedListNode previous=llist;
    SinglyLinkedListNode current=llist.next;
    while(current.next!=null)
    {
        if(previous.data!=current.data)
        {
            previous=current;
            current=current.next;
        }
        else
        {
            previous.next=current.next;
            current=current.next;  
        }
    }
    if(current.data==previous.data)
    {
        previous.next=null;
    }
    return llist;
    }
