package packageFront;

import java.util.Scanner;


// I/P: "I work at ABC"
// O/p: "ABC at work I"
//O/P2: "CBA ta krok I"
//O/P3: "I krow ta CBA"
public class ReverseWordInString {
	
     static String reverseWord(String str){
    	 String word = "";
    	 String result = "";
    	 
    	 String[] s = str.split(" ");
    	 for(String a : s) {
    		 result = a+ " " + result;
    	 }
    	 
    	 return result;
     }
     
     static String reversewholeString(String str){
    	 String word = "";
    	 String result = "";
    	 
    	 char[] ch = str.toCharArray();
    	 for(int i=0;i <ch.length;i++) {
    		 result = ch[i]+result;
    	 }
    	 return result;
     }
     
     static String reverseCharWord(String str){
    	 String word = "";
    	 String result = "";
    	 
    	 char[] ch = str.toCharArray();
    	 for(int i=0;i <ch.length;i++) {
    		 word = ch[i]+word;
    	 }
    	String[] revString=word.split(" ");
    	for(String a: revString) {
    		result = a + " " + result;
    	}
    	return result;
     }
}
			



