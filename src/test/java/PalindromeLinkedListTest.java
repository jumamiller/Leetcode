import org.example.ListNode;
import org.example.PalindromeLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {
    PalindromeLinkedList palindromeLinkedList;
    @BeforeEach
    public void setUp() {
        palindromeLinkedList= new PalindromeLinkedList();
    }

    @Test
    @DisplayName("Palindrome linked list")
    public void testIsValidPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean expected = true;
        boolean result = palindromeLinkedList.isValidPalindromToArr(head);
        assert(expected == result);
    }
}
