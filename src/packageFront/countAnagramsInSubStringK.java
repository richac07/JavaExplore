package packageFront;

import java.util.Arrays;
import java.util.HashMap;

public class countAnagramsInSubStringK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Brute Force
		//		
		//		String s1= "aabaabaabb";
		//		String s2 = "aaba";
		//		int nS1 = s1.length();
		//		int nS2 = s2.length();
		//		System.out.println(nS1);
		//		System.out.println(nS2);
		//		
		//		
		//		char[] chS = new char[nS2];
		//		char[] chS2= s2.toCharArray();
		//		Arrays.sort(chS2);
		//		int ans =0;
		//		
		//		int i =0;
		//		int index= 0;
		//		
		//		while(i<=nS1-nS2) {
		//			for(int j=i;j<i+nS2;j++) {
		//				
		//				chS[index]=s1.charAt(j);
		//				index++;
		//			}
		//			i++;
		//			index= 0;
		//			System.out.println("==========");
		//			System.out.print(chS);
		//			
		//			Arrays.sort(chS);
		//				
		//			if(Arrays.equals(chS, chS2)) {
		//				
		//				ans++;
		//				
		//			}
		//			
		//		}
		//		
		//		System.out.println("=============RESULT============");
		//		System.out.println(ans);
		//		
		//		
		//				
		//

		String s1= "aabaabaabb";
		String s2 = "aaba";
		int nS1 = s1.length();
		int nS2 = s2.length();
		int ans=0;


		HashMap<Character, Integer> mp= new HashMap<>();
		for(int i=0; i<nS2; i++) {
			if(mp.containsKey(s2.charAt(i))) {
				mp.put(s2.charAt(i), mp.get(s2.charAt(i))+1);
			}
			else {
				mp.put(s2.charAt(i),1);
			}

		}
		mp.forEach((k,v)-> System.out.println(k + "=" +v));
		int count =mp.size();
		int i=0,j=0;

		while(j<nS1) {
			System.out.print("CURRENT VALUE" +j + "-->" +s1.charAt(j));
			
			if(mp.containsKey(s1.charAt(j))) {
				mp.put(s1.charAt(j), mp.get(s1.charAt(j))-1);
				if(mp.get(s1.charAt(j))==0) {
					count--;
				}
			}
			System.out.println("===============");
			mp.forEach((k,v)-> System.out.println(k + "=" +v));
			System.out.println("count value " +count);
		

			if(j-i<nS2) {
				j++;
			}

			if(j-i==nS2){
				if(count==0) {
					ans++;
				}
				if(mp.containsKey(s1.charAt(i))){
					if(mp.get(s1.charAt(i))==0) {
						count++;
					}
					mp.put(s1.charAt(i), mp.get(s1.charAt(i))+1);
				}
				System.out.println("===============ONE LOOP DONE================");
				i++;
				

			}

		}

		System.out.println("Anagram count: " +ans);

	}

}
