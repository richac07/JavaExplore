package packageFront;

public class Palindrome_StringInput {

	public static boolean isValid(char c) {
		return Character.isLetterOrDigit(c);
		//return Character.isLetter(c);
		
		//return ((c>='a' && c<='z') || (c>='0' && c<='9'))? true: false;
	}

//	public static boolean isPalindrome(String s) {
//		String str=s.toLowerCase();
//		for(int i=0,j=s.length()-1;i<j;) {
//			char ith=str.charAt(i);
//			char jth=str.charAt(j);
//			if(!isValid(ith)) {
//				i++;
//			}
//			else if(!isValid(jth)) {
//				j--;
//			}
//			
//			else {
//				if(str.charAt(i)!=str.charAt(j)) {
//					return false;
//				}
//				else {
//				i++;
//				j--;
//				}
//			}
//			
//		}
//		return true;
//			
//		}
	
	public static boolean isPalindrome(String str) {
		 str=str.toLowerCase();
		for(int i=0,j=str.length()-1;i<j;) {
			char ith=str.charAt(i);
			char jth=str.charAt(j);
			if(!isValid(ith)) {
				i++;
			}
			else if(!isValid(jth)) {
				j--;
			}
			
			else {
				if(str.charAt(i)!=str.charAt(j)) {
					return false;
				}
				else {
				i++;
				j--;
				}
			}
			
		}
		return true;
			
		}
		


	public static void main(String[] args) {
		String s = "A1 man, a plan, a canal: Panam1a";
		int n = s.length()-1;
		boolean bool=isPalindrome(s);
		if (bool) {
			System.out.println("ITS A PALINDROME !!!!!!!!");
		}
		else {
			System.out.println("ITS  NOT A PALINDROME :( ");
		}
	}
}


