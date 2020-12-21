import java.util.*;
import java.io.*;

public class AddTwoNumbers{
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public ListNode addLinkedLists(ListNode l1, ListNode l2){
        ListNode sum = new ListNode();
        ListNode solution = sum;
        int carryOver = 0;
        while(l1 != null || l2 != null){
            int thisSum = 0;
            if (l1 != null){
                thisSum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                thisSum += l2.val;
                l2 = l2.next;
            }
            thisSum += carryOver;
            int thisDigit = thisSum % 10;
            carryOver = thisSum/10;
            sum.next = new ListNode(thisDigit);
            sum = sum.next;
        }
        if (carryOver > 0){
            sum.next = new ListNode(carryOver);
        }
        return solution.next;
    }
}