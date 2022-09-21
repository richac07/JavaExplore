package packageFront;

import java.util.HashMap;

public class Fibonacci {
	
	static int fib(int n) {
		if (n <= 1) {
			return n;
			
		}
		return fib(n-1) + fib(n-2);
	}

//	static int fib(int n) {
//		HashMap<Integer, Integer> hs= new HashMap<Integer, Integer>();
//		if (n==0) {
//			return 0;
//		}
//		if(n<2) {
//			return 1;
//		}
//		
//		if(hs.containsKey(n)) {
//			return hs.get(n);
//		}
//		
//		int nthValue = fib(n-1) +fib(n-2);
//		hs.put(n, nthValue);
//		
//		return nthValue;
//		
//	}
}
