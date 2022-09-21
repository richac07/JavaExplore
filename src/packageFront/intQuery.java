package packageFront;

import java.util.Arrays;

public class intQuery {
	
	

	public static void main(String[] args) {
		
		int[] arr = {1, 0, 2, 0,3,0,4,5,6,0};
		int n= arr.length;
		int[] res= new int[n];
		res= trailingZero(arr);
		Arrays.stream(res).forEach(System.out::println);
		

	}

	private static int[] trailingZero(int[] arr) {
		int n= arr.length;
		int i=n-1;
		int temp = n-1;
		if(arr[n-1]==0) {
			i--;
			
		}
		while( i>=0 ) {
			if(arr[i]!=0) {
				temp = i;
			}
			
			if(arr[i]==0) {
				swap(arr,arr[i], temp);
			}
			i--;
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int t = arr[i];
		arr[j]= arr[i];
		arr[i]=t;
		
	}

}
