import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MaxSumSubArrayOfSizeKTest {

	@Test
	void test_001() {
		int actual = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2});
		int expected = 9;
		
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_002() {
		int actual = MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5});
		int expected = 7;
		
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	void test_003_KSameArraySize() {
		int actual = MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5});
		int expected = 8;
		
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_004_KOne() {
		int actual = MaxSumSubArrayOfSizeK.findMaxSumSubArray(1, new int[] { 2, 1, 5});
		int expected = 5;
		
		
		org.junit.Assert.assertEquals(expected, actual);
	}

	@Test
	void test_005_KZero() {
		int actual = MaxSumSubArrayOfSizeK.findMaxSumSubArray(0, new int[] { 2, 1, 5});
		int expected = -1;
		
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_006_KNegative() {
		int actual1 = MaxSumSubArrayOfSizeK.findMaxSumSubArray(-1, new int[] { 2, 1, 5});
		int actual2 = MaxSumSubArrayOfSizeK.findMaxSumSubArray(Integer.MIN_VALUE, new int[] { 2, 1, 5});
		int expected = -1;
		
		
		org.junit.Assert.assertEquals(expected, actual1);
		org.junit.Assert.assertEquals(expected, actual2);
	}
	
	@Test
	void test_007_Kgreater() {
		int actual1 = MaxSumSubArrayOfSizeK.findMaxSumSubArray(4, new int[] { 2, 1, 5});
		int actual2 = MaxSumSubArrayOfSizeK.findMaxSumSubArray(Integer.MAX_VALUE, new int[] { 2, 1, 5});
		int expected = -1;
		
		
		org.junit.Assert.assertEquals(expected, actual1);
		org.junit.Assert.assertEquals(expected, actual2);
	}
	
	@Test
	void test_008_ArrayEmpty() {
		int actual = MaxSumSubArrayOfSizeK.findMaxSumSubArray(4, new int[] {});
		int expected = -1;
		
		
		org.junit.Assert.assertEquals(expected, actual);
	}
}
