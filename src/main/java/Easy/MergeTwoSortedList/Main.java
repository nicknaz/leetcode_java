package Easy.MergeTwoSortedList;

public class Main {

    public static void main(String[] args) {

    }

    //without recursion
    public ListNode mergeTwoListsFirst(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        ListNode result = new ListNode();
        ListNode head = result;

        ListNode current1 = list1;
        ListNode current2 = list2;

        while (current1 != null && current2 != null) {
            if (current1.val > current2.val) {
                result.val = current2.val;
                result.next = new ListNode();
                result = result.next;
                current2 = current2.next;
            } else {
                result.val = current1.val;
                result.next = new ListNode();
                result = result.next;
                current1 = current1.next;
            }
        }
        if (current1 == null) {
            result.val = current2.val;
            result.next = current2.next;
        }
        if (current2 == null) {
            result.val = current1.val;
            result.next = current1.next;
        }

        return head;
    }

    public ListNode mergeTwoListsSecond(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val < list2.val){
            list1.next = mergeTwoListsSecond(list1.next, list2);
            return list1;
        } else{
            list2.next = mergeTwoListsSecond(list1, list2.next);
            return list2;
        }

    }

}
