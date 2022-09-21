package packageFront;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
	//BACKTRACKING
	public static void findPermutation(String str, int left, int right) {
		//BASE CONDITION
		if(str.length()==0) {
			//System.out.println("PROVIDE A STRING");

		}
		if(left==right) {
			System.out.println(str);
		}
		else {
			for(int i =left;i<=right;i++) {
				//DO
				str=swap(str,left,i);
				//RECURSSION
				findPermutation(str,left+1,right);
				//UNDO
				str=swap(str,left,i);
			}
		}
	}


	public static List<String> findPermutationList(String str, int left, int right) {
		List<String> al= new ArrayList<>();
		//BASE CONDITION
		if(str.length()==0) {
			//System.out.println("PROVIDE A STRING");
			return al;

		}
		if(left==right) {
			System.out.println(str);
			al.add(str);
			return al;
		}

		for(int i =left;i<=right;i++) {
			//DO
			str=swap(str,left,i);
			//RECURSSION
			findPermutation(str,left+1,right);
			//UNDO
			str=swap(str,left,i);
		}
		return al;

	}

	private static String swap(String str, int left, int i) {
		char[] chStr=str.toCharArray();
		char t;
		t=chStr[left];
		chStr[left]=chStr[i];
		chStr[i]=t;
		return String.valueOf(chStr);
		

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		//findPermutation(str,0,str.length()-1);
		List<String> al= new ArrayList<>();
		al=findPermutationList(str,0,str.length()-1);
		
		al.stream().forEach(System.out::println);
		System.out.println("TOTAL NUMBER OF PERMUTATIONS ARE: " +al.size());
		




	}

}
