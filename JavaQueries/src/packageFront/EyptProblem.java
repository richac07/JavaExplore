package packageFront;

import java.util.Map;
import java.io.*;
import java.util.*;

public class EyptProblem {
	
	//Input 
/*	
4
9 0123456789 oF8
Foo oF8 0123456789
13 0123456789abcdef 01
CODE O!CDE? A?JM!. 
	*/
	    
	    private static int convertToDecimal(String num, Map<Character, Integer> map){
	        int base = map.size();
	        int val = 0;
	        for(int i = 0; i < num.length(); i++)
	            val+=Math.pow(base, num.length() - 1 - i)*map.get(num.charAt(i));
	        return val;
	    }
	    
	    private static String convertToBase(int num, Map<Integer, Character> map){
	        int base = map.size();
	        StringBuilder sb = new StringBuilder();
	        while(num > 0){
	            int remainder = num % base;
	            num = num / base;
	            sb.append(map.get(remainder));
	        }
	        return sb.reverse().toString();
	    }
	    
	     static String convert(String num, String alphabet1, String alphabet2){
	        Map<Character, Integer> aMap1 = new HashMap<>();
	        Map<Integer, Character> aMapReversed2 = new HashMap<>();
	        
	        for(int i=0; i<alphabet1.length(); i++)
	            aMap1.put(alphabet1.charAt(i), i);
	        
	        for(int i=0; i<alphabet2.length(); i++)
	            aMapReversed2.put(i, alphabet2.charAt(i));
	        
	        int decimal = convertToDecimal(num, aMap1);
	        String res = convertToBase(decimal, aMapReversed2);
	        return res;
	    }
}
