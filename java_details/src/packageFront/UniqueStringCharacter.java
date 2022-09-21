package packageFront;

import java.util.Arrays;
import java.util.HashMap;

public class UniqueStringCharacter {
	
	
	
	
	static boolean uniqueString(String str) {
		int[] tracker = new int[26];
		Arrays.fill(tracker,0);
		String str1= str.toUpperCase();
		int n = str1.length();
		for(int i=0;i<n;i++) {
			int index = str1.charAt(i)-'A';
			
			if(index<0) {
				
			}
			else {
				tracker[index]++;
				if(tracker[index]>1) {
					return false;
					
				}
			}
			
		}
		return true;
	}
	
//	static void uniqueString(String[] arr) {
//		System.out.println(arr[0]);
//		//char[] ch = value.toCharArray();
//		int[] hash1 = new int[26];
//		for (int i=0; i< arr.length; i++) {
//			arr[i]=arr[i].toUpperCase();
//			System.out.println(arr[0]);
//			System.out.println("ok");
//			
//			
//		}
//		
//	}
//	
//	static boolean uniqueString1(String arr) {
//		
//		arr= arr.toUpperCase();
//		char[] chArray = arr.toCharArray();
//		int[] hash1 = new int[26];
//		int index=0;
//		for (int i=0; i< chArray.length; i++) {
//			char ch= chArray[i];
//			index= ch -'A';
//			if(index >0) {
//				
//			//hash1[index]=hash1[index] +1;
//			hash1[index]++;
//			System.out.println(hash1[index]);
//			if (hash1[index] > 1) {
//				return false;
//			}
//			}
//		}
//			
////		for(int i=0; i<26; i++) {
////			if(hash1[index] > 1) {
////				return false;
////			}
////		}
//		return true;
//
//}
//	
//	// No need to change the string to array
//	static boolean uniqueChar(String str){
//	    str= str.toUpperCase();
//	    int[] hash1 =new int[26];
//	    //HashMap<Integer, Integer> hs = new HashMap <Integer,Integer>();
//	    int index = 0;
//	    for(int i=0;i<str.length(); i++){
//	        char ch = str.charAt(i);
//	        index = ch - 'A';
//	        if(index>0){
//	           hash1[index]++;
//	           System.out.println(hash1[index]);
//	        }
//	        if(hash1[index] >1){
//	            return false;
//	        }
//	    }
//
//	    return true;
//	}
//	
//	
//	
//	
//static void uniqueStringWithCharValue(String arr) {
//		
//		arr= arr.toUpperCase();
//		char[] chArray = arr.toCharArray();
//		int[] hash1 = new int[26];
//		int index=0;
//		String status="Unique";
//		for (int i=0; i< chArray.length; i++) {
//			char ch= chArray[i];
//			index= ch -'A';
//			hash1[index]=hash1[index] +1;
//			System.out.println(hash1[index]);
//			if (hash1[index] > 1) {
//				status = "NotUnique";
//				System.out.println("Ohh!! NOT UNIQUE. " +"\n" + chArray[i] + " is the repeated Value. Please change to make it Unique");
//				break;
//			}
//			}
//		if(status =="Unique") {	
//		System.out.println("Congrats, its Unique");
//		}
//		
//
//}
}
