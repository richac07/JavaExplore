package packageFront;

import java.util.Arrays;

public class SecondLargestNumberArray {

	int[] a  = {2,3,4,1};
	
	static void secondLargest(int[] arrInput) {
		int total= arrInput.length;
		Arrays.sort(arrInput);
		System.out.println("The second laregest Number in array is " + arrInput[total-2]);
	}
	
	static int secondLargestDirect(int[] arrInput) {
		int first, second;
		first = second = arrInput[0];
		int len = arrInput.length;
		if (len <2) {
			System.out.println("Please create a larger array");
			return 0;
		}
		
		for (int i=0; i < len; i++) {
			if (first <arrInput[i] ) {
				second=first;
				first= arrInput[i];
			}
			if (first > arrInput[i] && second < arrInput[i]) {
				second= arrInput[i];
			}
		}
		
		return second;
	}
		
 
 
}
