package packageFront;


public class SingleArrayMultiplicationOtherNumbers {

	// I/O: 2,3,4
	//O/P: 12,8,6
	static void multipleArray(int[] arr) {
		int mult=1;
		for(int i=0;i<arr.length;i++) {
			mult= mult*arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=mult/arr[i];
			System.out.print( arr[i] + " ");
		}
		
	}

}
