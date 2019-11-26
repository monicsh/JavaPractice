
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LinkedListCycleTest {
	ListNode head = null;
	
	void setUp(boolean cycle, boolean evenNodes) {
		head = new ListNode(1);
		head.next = new ListNode(2);
	    head.next.next = new ListNode(3);
	    head.next.next.next = new ListNode(4);
	    head.next.next.next.next = new ListNode(5);
	    head.next.next.next.next.next = new ListNode(6);
	    
	    if (cycle)
	    	if (evenNodes)
	    		head.next.next.next.next.next.next = head.next.next;
	    	else 
	    		head.next.next.next.next.next.next = head.next.next.next;
	    
	}

	@Test
	void test_NotCycle() {
		boolean setUpForCycle = false;
		setUp(setUpForCycle, false);
		
		boolean actual = LinkedListCycle.hasCycle(head);
		org.junit.Assert.assertFalse(actual);
	}
	
	@Test
	void test_Cycle001() {
		boolean setUpForCycle = true;
		boolean evenNodes = false;
		setUp(setUpForCycle, evenNodes);
	    
	    boolean actual = LinkedListCycle.hasCycle(head);
	    org.junit.Assert.assertTrue(actual);
	    
	}

	@Test
	void test_Cycle002() {
		boolean setUpForCycle = true;
		boolean evenNodes = true;
		setUp(setUpForCycle, evenNodes);
	
	    boolean actual = LinkedListCycle.hasCycle(head);
	    org.junit.Assert.assertTrue(actual);
	    
	}
	
	@Test
	void test_NotCycle_SingleNode() {
		ListNode head = new ListNode(1);
		
		boolean actual = LinkedListCycle.hasCycle(head);
		org.junit.Assert.assertFalse(actual);
		
	}
	
	@Test
	void test_Cycle_SingleNode() {
		ListNode head = new ListNode(1);
		head.next = head;
		
		boolean actual = LinkedListCycle.hasCycle(head);
		org.junit.Assert.assertTrue(actual);
	}
	
	@Test
	void test_NotCycle_TwoNode() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		
		boolean actual = LinkedListCycle.hasCycle(head);
		org.junit.Assert.assertFalse(actual);
	}
	
	@Test
	void test_Cycle_TwoNode() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = head;
		
		boolean actual = LinkedListCycle.hasCycle(head);
		org.junit.Assert.assertTrue(actual);
	}
	
}
