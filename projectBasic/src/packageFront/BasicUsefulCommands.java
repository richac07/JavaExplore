package packageFront;

import java.util.Arrays;
import java.util.HashMap;

public class BasicUsefulCommands {

	public static void main(String[] args) {
		int arr[]= {10,20,15,40,30};
		int arr1[]= {10,20,30,40,50};
		int arr2[]= {10,20,15,40,30,60,50};
		int arr3[]= {50,40,30,20,10};
		int[] defaultV=new int[10];
		Arrays.fill(defaultV, -1);
		
		int min1= Arrays.stream(arr3).min().getAsInt();
		int max1= Arrays.stream(arr1).max().getAsInt();
		System.out.println("Min Val: " +min1);
		System.out.println("Max Val: " +max1);
		
		int a =0;
		char b = (char)a;
		int nexto=5;
		//Concat option  1
		String s1 = "acc";
		//Concat
		System.out.println("Concat Values");
		String newone=Integer.toString(a).concat("+").concat(Integer.toString(nexto));
		String conca= newone+s1;
		System.out.println(newone);
		System.out.println("String concat "+conca);
		System.out.println("Steam on an array");
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("Stream on an array ");
		Arrays.stream(arr3).forEach(System.out::print);
		
		System.out.println("Putting values to Map and printing");
		HashMap<Integer, Integer> mp =new HashMap<>();
		for(int i=0;i<arr.length;i++){
			mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
		}

		mp.forEach((k,v)->System.out.println(k + "=" +v));
	
		




	}

}
