package packageFront;

public class MaxPalindromeString {
	
	static int max(int a, int b) {
		return ((a>b)?a:b);
	}
	
	static int lps(String str, int i, int j) {
		char[] chStr = str.toCharArray();
		if(i==j) {
			return 1;
		}
		else if (chStr[i] == chStr[j] && j==i+1) {
			return 2;
		}
		
		else if(chStr[i]== chStr[j]) {
			return lps(str,i+1,j-1)+2;
		}
		
		else {
			return max(lps(str, i, j-1), lps(str,i+1,j));
		}
		
		
	}

}
