package packageFront;

public class ReplaceStringSpace {
	
	public static String addString (String s) {

		int trueLen = s.length();
		if(s.contains(" ")) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) == ' ') {
					trueLen = trueLen+3;
				}
			}
		}
				
				char oldArr[] = s.toCharArray();
				char newArr[] = new char[trueLen];
				
				int x=0;
				for(int i=0; i<s.length();i++) {
					if(oldArr[i]== ' ') {
						newArr[x]='%';
						newArr[x+1]='2';
						newArr[x+2]='0';
						x+=3;
						
					}
					else {
						newArr[x]=oldArr[i];
						x++;
						
					}
				
				
			}
		
			String newString = new String(newArr,0,trueLen);
			return newString;
		

}
}

//int i=0;
//while(i<str.length()) {
//	if(str.charAt(i) == ' ') {
//		str = str.substring(0,i) + "%20" + str.substring(i+1);
//		System.out.println(str);
//		i=i+3;
//		
//	}
//	else {
//		i++;
//	}
//	
//}
//System.out.println(str);
//return str;

//String str = s.trim();