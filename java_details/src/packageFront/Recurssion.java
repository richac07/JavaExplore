package packageFront;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recurssion {

	//Print all the subsets
	public static void printSubset(String ip, String op) {
		if(ip.length()==0) {
			System.out.println(op);

		}
		else {
			printSubset(ip.substring(1),op+ip.charAt(0));
			printSubset(ip.substring(1),op);

		}
	}

	// Print only the unique subsets
	public static Set<String> printUniqueSubset(String ip, String op, Set<String> uniqueStr) {

		if(ip.length()==0) {
			uniqueStr.add(op);
			return new HashSet<>();

		}

		else {
			printUniqueSubset(ip.substring(1),op,uniqueStr);
			printUniqueSubset(ip.substring(1),op+ip.charAt(0),uniqueStr);
			return uniqueStr;
		}

	}

	//print all the permutations
	public static void printPermutation(String ip, String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;

		}

		String op1= op+ " "+ ip.charAt(0);
		String op2= op+ip.charAt(0);
		printPermutation(ip.substring(1),op2);
		printPermutation(ip.substring(1),op1);


	}


	public static void printChangeCase(String ip, String op) {
		if(ip.length()==0) {
			System.out.println(op);
			return;

		}



		printChangeCase(ip.substring(1),op+ip.toUpperCase().charAt(0));
		printChangeCase(ip.substring(1),op+ip.charAt(0));


	}

	//Josephus Problem
	public static void josephus(List<Integer> ls, int k, int index) {
		if(ls.size()==1) {
			System.out.println(ls.get(0));
			return;
		}

		
		index = (index+k-1) % ls.size();
		ls.remove(index);
		josephus(ls,k,index);
	

	}



	public static void main(String[] args) {

		String ip= "abc";
		String op="";
		int count =0;


		printSubset(ip,op);
		//Permutation
		op=op+ip.charAt(0);
		ip = ip.substring(1);
		System.out.println("Permuataions: ");
		printPermutation(ip,op);

		//Permutation with case change

		System.out.println("Permuataions with Case Change: ");
		printChangeCase(ip,op);



		Set<String> uniqueSubset = new HashSet<>();
		uniqueSubset = printUniqueSubset("aab", "", uniqueSubset);

		// If want sorted
		List<String> ls= new ArrayList<>(uniqueSubset);
		Collections.sort(ls);
		System.out.println("Unique subsets: ");
		uniqueSubset.forEach(System.out::println);
		System.out.println("Unique Sorted subsets: ");
		ls.forEach(System.out::println);

		List<Integer> ls1= new ArrayList<>();
		int n =40;
		int k=7;
		int index=0;
		for(int i = 0; i<n; i++) {
			ls1.add(i+1);
		}
		System.out.println("Josephus Problem");
		josephus(ls1,k,index);


	}

}
