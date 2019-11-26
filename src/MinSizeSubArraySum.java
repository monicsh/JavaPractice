class MinSizeSubArraySum {
  public static int findMinSubArray(int S, int[] arr) {
	  // Empty Array
	  if (arr.length == 0)
	  {
		  return -1;
	  }
    int smallestSubarrayLength = Integer.MAX_VALUE;
    int windowStart = 0;
    int currSum = 0;

    for(int windowEnd = 0; windowEnd<arr.length; windowEnd++)
    {
      currSum += arr[windowEnd];

      while (currSum >= S)
      {
        int currWindowSize = windowEnd - windowStart + 1;
        if (currWindowSize < smallestSubarrayLength)
        {
          smallestSubarrayLength = currWindowSize;
        }

        currSum -= arr[windowStart];
        windowStart++;
      }
    }

    if (smallestSubarrayLength > arr.length)
    {
      return -1;
    }
    return smallestSubarrayLength;
  }

}
