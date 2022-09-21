package packageFront;

import java.util.*;

public class maxSumSubArrayMod {

	// Return the maximum sum subarray mod m.
	  static int maxSubarray(int[] arr, int n, int m)
	  {
	    int prefix = 0;
	    int maxim = 0;
	    Set<Integer> S = new HashSet<Integer>();
	    S.add(0);
	 
	    // Traversing the array.
	    for (int i = 0; i < n; i++)
	    {
	 
	      // Finding prefix sum.
	      prefix = (prefix + arr[i]) % m;
	 
	      // Finding maximum of prefix sum.
	      maxim = Math.max(maxim, prefix);
	 
	      // Finding iterator pointing to the first
	      // element that is not less than value
	      // "prefix + 1", i.e., greater than or
	      // equal to this value.
//	      int it = 0;
//	 
//	      for (int j : S)
//	      {
//	        if (j >= prefix + 1)
//	          it = j;
//	      }
//	      if (it != 0)
//	      {
//	        maxim = Math.max(maxim, prefix - it + m);
//	      }
//	 
//	      // adding prefix in the set.
//	      S.add(prefix);
	    }
	    return maxim;
	  }
}
