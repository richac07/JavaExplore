package packageFront;

public class NonAlphabeticChar {

	public static int min(int a, int b) {
		return (a<b?a:b);
	}
	public static int firstNonSorted(String s, int start, int end) {
		int mid=start +(end-start)/2;
		if(start> end) {
			return -1;
		}
		if(s.length()==0|| start>=s.length()) {
			return -1;
		}
		if(s.charAt(start)<s.charAt(start-1)) {
			return start;
		}
		if(s.charAt(mid)<s.charAt(mid-1)) {
			return mid;
		}
		if(s.charAt(end)<s.charAt(end-1)) {
			return end;
		}
		
		
		 return min(firstNonSorted(s,start+1,mid-1), firstNonSorted(s,mid+1,end-1));
		
	}
	public static void main(String[] args) {
	
			String s= "Beahivz";
			int n=s.length();
			int val=firstNonSorted(s,1,n-1);
			if(val== -1) {
				System.out.println("ITS FULLY SORTED");
			}
			else {
				System.out.println("String is unSORTED at index: " +val +" and the vlaue is: "+s.charAt(val));
			}
	}

}
