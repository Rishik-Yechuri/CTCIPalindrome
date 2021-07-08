import java.util.*;

public class CTCIPalindrome {
    public static void main(String[] args) {
        ListNode word = new ListNode("b",new ListNode("o",new ListNode("t",new ListNode("t",new ListNode("l",new ListNode("e",new ListNode("l",new ListNode("t",new ListNode("t",new ListNode("b",new ListNode("o")))))))))));
        System.out.println(isPalindrome(word));
    }

    public static boolean isPalindrome(ListNode originalList) {
        HashMap<String,Integer> numOfOccurrences = new HashMap<>();
        int numOfOdds = 0;
        while(originalList != null){
            if(!numOfOccurrences.containsKey(originalList.val)){
                numOfOccurrences.put(originalList.val,0);
            }
            numOfOccurrences.put(originalList.val, numOfOccurrences.get(originalList.val)+1);
            numOfOdds = numOfOdds + (numOfOccurrences.get(originalList.val) % 2 == 0 ? -1 : 1);
            originalList = originalList.next;
        }
        if(numOfOdds > 1)return false;
        return true;
    }
}

class ListNode {
    String val;
    ListNode next;

    ListNode() {
    }

    ListNode(String val) {
        this.val = val;
    }

    ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
