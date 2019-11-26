/*
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 */
import java.util.Arrays;

class AverageOfSubarrayOfSizeK {
  public static double[] findAverages(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];
    double windowSum = 0;
    int windowStart = 0;
    
    for(int windowEnd=0; windowEnd < arr.length; windowEnd++) {
    	windowSum += arr[windowEnd];
    	
    	if (windowEnd >= K-1)
    	{
    		result[windowStart] = windowSum/K;
    		windowSum -= arr[windowStart];
    		windowStart++;
    	}
    }

    return result;
  }
}
