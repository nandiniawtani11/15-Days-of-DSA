class Solution {
    ListNode head=null,tail=null;
    public void insert(int n){
        if(head==null && tail==null){
            head=new ListNode(n);
            tail=head;
        }
        else{
            ListNode x=new ListNode(n);
            tail.next=x;
            tail=x;
        }
    }
    
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode t1=head1,t2=head2;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                insert(t1.val);
                t1=t1.next;
            }else{
                insert(t2.val);
                t2=t2.next;
            }
        }
        while(t1!=null){
            insert(t1.val);
            t1=t1.next;
        }
        while(t2!=null){
            insert(t2.val);
            t2=t2.next;
        }
        return head;
    }
}
