package packageFront;

import java.util.HashMap;

public class VariableSlidingWindow {
	static int max(int a, int b){
		return (a>b?a:b);
	}

	public static void main(String[] args) {
		// This code is for Longest SubString with k uniuque value
		
		//String s= "abcdefabacbebebe";
		String s= "aabacbebebe";
		int k =3;
		
		int i=0, j=0;
		int n= s.length();
		int ans = Integer.MIN_VALUE;
		int tempAns=0;
	
		HashMap<Character, Integer> mp = new HashMap<>();
		
		while(j<n) {
			//Condition
			
			if(mp.containsKey(s.charAt(j))) {
				mp.put(s.charAt(j), mp.get(s.charAt(j))+1);
			}
			else {
				mp.put(s.charAt(j),1);
			}
			
			int count = mp.size();
			
			if(count<k) {
				j++;
			}
			
			else if(count==k) {
				tempAns = j-i+1;
				System.out.println("i= "+i +" and j is "+j);
				ans= max(tempAns,ans);
				j++;
				
			}
			
			else if( count > k) {
				while(count >k) {
					mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
					if(mp.get(s.charAt(i))==0) {
						mp.remove(s.charAt(i));
						count=mp.size();
						System.out.println("count is "+count);
					}
					i++;
				}
				j++;
			}
			
		}
		System.out.println("========ANS is: " +ans + "========");

	}

}
