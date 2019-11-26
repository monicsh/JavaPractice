import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
	public static int findLength(String str, int K) {
		// Empty String
		if (str == null || str.length() == 0 || str.length() < K)
			throw new IllegalArgumentException();
		
	    int maxLength = 0;
		int windowStart = 0;
		Map<Character, Integer> lookup = new HashMap<Character, Integer>();
		
		char[] inputStr = str.toCharArray();
	    
	    
	    for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
	    	// MAke entry in Map: Add new element with count 1
	    	//					: Update existing element with incrementing the count
	    	char ch = inputStr[windowEnd];
	    	if (lookup.containsKey(ch))
	    		lookup.put(ch, lookup.get(ch) + 1);
	    	else
	    		lookup.put(ch, 1) ;
	    	
	    	
	    	while(lookup.size() > K) {
	    		// Update count of windowStart element by decrementing by 1
	    		char ele = inputStr[windowStart];
	    		lookup.put(ele, lookup.get(ele)-1);
	    		// If it is 0 => Remove from hashmap
	    		if (lookup.get(ele) == 0) {
	    			lookup.remove(ele);
	    		}
	    		// move start  ahead
	    		windowStart++;
	    		
	    	}
	    	
	    	if (lookup.size() <= K) {
	    		maxLength = Math.max(maxLength, (windowEnd - windowStart + 1));
	    	}
	    		
	    }

		return maxLength;
	   
	  }
}
