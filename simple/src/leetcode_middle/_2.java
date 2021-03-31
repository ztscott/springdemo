package leetcode_middle;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }}

public class _2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l = addTwoNumbers(l1,l2);
        System.out.println(l.val);
        System.out.println(l.next.val);
        System.out.println(l.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        ListNode listNode = new ListNode(-1);
        ListNode pre = listNode;
        while(l1 != null || l2 != null || count != 0 ){
            if(l1 != null){
                count += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                count += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(count%10);
            pre = pre.next;
            count /= 10;  //这是关键一步，逢10进1


        }
        return listNode.next;



    }
}
