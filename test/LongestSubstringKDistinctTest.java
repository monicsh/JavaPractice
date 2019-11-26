import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringKDistinctTest {
	@Test
	void test_001() {
		String inputStr = "araaci";
		int K = 2;
		int actual = LongestSubstringKDistinct.findLength(inputStr, K);	    
		int expected = 4;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_002() {
		String inputStr = "araaci";
		int K = 1;
		int actual = LongestSubstringKDistinct.findLength(inputStr, K);	    
		int expected = 2;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_003() {
		String inputStr = "cbbebi";
		int K = 3;
		int actual = LongestSubstringKDistinct.findLength(inputStr, K);	    
		int expected = 5;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_004() {
		String inputStr = "araacaci";
		int K = 2;
		int actual = LongestSubstringKDistinct.findLength(inputStr, K);	    
		int expected = 5;
		
		org.junit.Assert.assertEquals(expected, actual);
	}
	
	@Test
	void test_InvalidInput_KgreaterThanStringLength(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
				LongestSubstringKDistinct.findLength("abc", 7);
			});
		  

	}
	
//	@Test
//	void test_InvalidInput_EmptyString() {
//		String inputStr = "";
//		int K = 3;
//		int actual = LongestSubstringKDistinct.findLength(inputStr, K);	    
//
//	}
}
