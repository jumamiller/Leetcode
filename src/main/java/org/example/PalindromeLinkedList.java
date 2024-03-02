package org.example;

import java.util.ArrayList;

public class PalindromeLinkedList {

    public  boolean isValidPalindromToArr(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            arrayList.add(current.val);
            current = current.next;
        }

        // Check if array is palindrome
        int left = 0;
        int right = arrayList.size() - 1;
        while (left < right) {
            if (!arrayList.get(left).equals(arrayList.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isValidPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}