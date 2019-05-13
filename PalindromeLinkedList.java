import java.util.LinkedList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if(head == null){
            return true;
        }

        ListNode temp = isPalindromeHelper(head);
        //ListNode
        System.out.println(head.next.val);
        System.out.println(temp.next.val);
        while(head!=null && temp!=null){
            //System.out.println(head.next.val);

            if(head.val == temp.val){
                System.out.println(temp.val);
                System.out.println(temp.next.val);
                System.out.println(temp.next.next.val);
                System.out.println(head.val);

                head = head.next;
                temp = temp.next;
                continue;
            }else{
                System.out.println("Came here");
                return false;
            }
        }
        return true;

    }

    ListNode isPalindromeHelper(ListNode newHead){
        if(newHead==null || newHead.next == null){
            return newHead;
        }
        //newList = newList.next;
        ListNode newList = isPalindromeHelper(newHead.next);
        newHead.next.next = newHead;
        newHead.next = null;
        /*while(newList!=null){
        System.out.println(newList.val);
        }*/
        return newList;
    }

    public static void main(String[] args) {
        ListNode ptr;
        ptr = new ListNode(1);
        ptr.next = new ListNode(1);
        ptr.next.next = new ListNode(2);
        ptr.next.next.next = new ListNode(1);

        PalindromeLinkedList permutation = new PalindromeLinkedList();
        boolean temp = permutation.isPalindrome(ptr);
        System.out.println(temp);

    }
}
