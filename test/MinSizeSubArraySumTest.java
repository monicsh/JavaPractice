
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MinSizeSubArraySumTest {
	
	@Test
	void test_001() {
		int actual = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2});	    
		int expected = 2;
		
		org.junit.Assert.assertEquals(expected, actual);
	}

	@Test
	void test_002() {
	    int actual = MinSizeSubArraySum.findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 });
		int expected = 1;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_003() {
	    int actual = MinSizeSubArraySum.findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 });
		int expected = 3;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_004() {
		int actual = MinSizeSubArraySum.findMinSubArray(10, new int[] { 2, 1, 5, 2, 3, 2, 13});	    
		int expected = 1;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_005() {
		int actual = MinSizeSubArraySum.findMinSubArray(8, new int[] { 2, 1, 5, 3, 2, 8, 1, 1});	    
		int expected = 1;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_EmptyArray() {
		int actual = MinSizeSubArraySum.findMinSubArray(10, new int[] {});	    
		int expected = -1;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_NotFoundDesiredSubarray() {
		int actual = MinSizeSubArraySum.findMinSubArray(10, new int[] {1, 2, 3, 2, 1});	    
		int expected = -1;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
}
