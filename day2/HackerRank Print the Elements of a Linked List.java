static void printLinkedList(SinglyLinkedListNode head) {
        if(head==null)
        {
            return;
        }
        SinglyLinkedListNode current=head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }


    }
