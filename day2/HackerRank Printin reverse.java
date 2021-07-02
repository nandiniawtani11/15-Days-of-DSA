 public static void reversePrint(SinglyLinkedListNode llist) {
    // Write your code here
    SinglyLinkedListNode next=null;
    SinglyLinkedListNode current=llist;
    SinglyLinkedListNode previous=null;
    while(current!=null)
    {
        next=current.next;
        current.next=previous;
        previous=current;
        current=next;
    }
    while(previous!=null)
    {
        System.out.println(previous.data);
        previous=previous.next;
    }
    }
