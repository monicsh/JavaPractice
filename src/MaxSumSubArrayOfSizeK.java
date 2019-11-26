/*
 * Given an array of positive numbers and a positive number 'K'. 
 * Find the maximum sum of any contiguous subarray of size ‘K’.
 */
class MaxSumSubArrayOfSizeK {
	  public static int findMaxSumSubArray(int K, int[] arr) {
		// Empty Array
			if (arr.length == 0)
				return -1;
			
		// Invalid K 
		if (K <= 0 || K > arr.length)
			  return -1;
		
		  
	    int maxSum = Integer.MIN_VALUE;
	    int currSum = 0;
	    
	    int windowStart = 0;
	    for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
	    	currSum += arr[windowEnd];
	    	
	    	if (windowEnd >= K-1)
	    	{
	    		if (currSum > maxSum)
	    		{
	    			maxSum = currSum;
	    		}
	    		
	    		currSum -= arr[windowStart];
	    		windowStart++;
	    	}
	    }
	    
	    return maxSum;
	  }
}