package packageFront;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class JavaStreamAndFill {
	
	static int ab(int a) {
		int b=0;
		int c=1;
		return b=5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert INT To string
		int x= 1;
		int y=2;
		boolean b=true;
		String temp= Integer.toString(x).concat("_").concat(Integer.toString(y)).concat("_").concat(Boolean.toString(b));
		String first2= temp.substring(3, 4  );
		System.out.println("Full String Name:   " + first2);
		
		System.out.println("Calling function" + ab(1));
		Random rand= new Random();
		
		int[] arr= new int[10];
		int[][] arr1= new int[10][10];
//		for(int i =0; i< arr.length; i++) {
//			arr[i]= rand.nextInt(100);
//		}
		
		//fill
		Arrays.fill(arr, 10);
		
		for(int[] in: arr1) {
			Arrays.fill(in, -1);
		}
		
		
		System.out.println("Before");
		for(int[] in: arr1) {
			Arrays.stream(in).forEach(ele -> System.out.println("2d vales with STREAM: " + ele + " "));
		}
		int a= Integer.MAX_VALUE;
		
		System.out.println("Array");
		System.out.println("2D : " +arr1[1][1]);
		
		
		//array
		Arrays.stream(arr).forEach(System.out::println);
		
		//hAsmap
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		mp.put(1, 1);
		mp.put(2, 5);
		mp.put(3, 9);
		mp.put(2, 7);
		
		System.out.println("hashmap");
		mp.forEach((k,v)-> System.out.println(k + "=" +v));
		
		//HashMap Value update:
		HashMap<Integer, Integer> mp1 = new HashMap<Integer, Integer>();
		int[] hm= {1,1,1,2,2,3};
		for(int i: hm) {
			//mp1.put(i, mp1.getOrDefault((i, 0) + 1));
			mp1.put(i, mp1.getOrDefault(i, 0)+ 1);
		}
		System.out.println("========== HASHMAP SET and default===========");
		mp1.forEach((key,v)->System.out.println(key + "=" +v));
		
		//arrayList
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(2);
		al.add(123);
		
		System.out.println("ArrayList");
		al.stream().forEach(ele-> System.out.println(ele + " "));
		//Collections.sort(al);
		
		//hashSet
		HashSet<Integer> hs= new HashSet<>(mp.keySet());
		hs.stream().forEach(ele ->System.out.print(ele + " "));
		hs.add(5);
		hs.stream().forEach(ele ->System.out.print("new Stream" + ele + " "));
		if (hs.contains(5)){
			System.out.print("YESY");
			
		}
		else {
			System.out.print("NO");
		}
		
		String str1 = "abcdeg";
		String str2 = "abcdeg";
		int n = str1.length();
		int m = str2.length();
		System.out.println(" STRING DATA");
		System.out.println(str1.charAt(n-1));
		if(str1.charAt(n-1) == str2.charAt(m-1)) {
			System.out.println("MATCHED :  " + str1.charAt(n-1));
		
		}
		
			
		
		
	}

}
