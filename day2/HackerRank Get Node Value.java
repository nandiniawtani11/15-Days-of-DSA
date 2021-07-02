 public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
    SinglyLinkedListNode fast=llist;
    SinglyLinkedListNode slow=llist;
    while(positionFromTail-->0)
    {
        fast=fast.next;
    }
    while(fast.next!=null)
    {
        fast=fast.next;
        slow=slow.next;
    }
    return slow.data;

    }
