package packageFront;

public class AllienLanguage {
	
	
	//Input 
//	4
//	9 0123456789 oF8
//	Foo oF8 0123456789
//	13 0123456789abcdef 01
//	CODE O!CDE? A?JM!.
	public static String sourceToTarget(String alianN, String sourceL, String targetL ){
        int decimalValue=0;
        int prod=1;
        int sourceLen= sourceL.length();
        int targetLen= targetL.length();
        String newNumber= "";
        
        for(int i= alianN.length()-1; i>=0; i--, prod=prod*sourceLen ){
            char numb= alianN.charAt(i);
            int alianValue= -1;
            for(int j=0; j<=sourceLen-1; j++ ){
            	
                if(sourceL.charAt(j) == numb){
                    alianValue = j;
                    break;
                }
            }
            
            decimalValue +=(alianValue *prod);
            
            }
        
        for(;decimalValue >0; decimalValue =decimalValue/targetLen){
            newNumber = targetL.charAt(decimalValue % targetLen) + newNumber;
        }
        return newNumber;

}
}
