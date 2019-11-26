import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AverageOfSubarrayOfSizeKTest {

	@Test
	void test_001() {
		double[] actual = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
		double[] expected = {2.2, 2.8, 2.4, 3.6, 2.8};
	    org.junit.Assert.assertEquals(expected.length, actual.length);
	}
	
	@Test
	void test_002() {		
		double[] actual = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
		double[] expected = {2.2, 2.8, 2.4, 3.6, 2.8};
	    org.junit.Assert.assertArrayEquals("equal",expected, actual, 0.1);
	}

}
