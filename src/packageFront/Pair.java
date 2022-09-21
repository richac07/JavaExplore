package packageFront;

public class Pair {
	private  int key;
	private  int value;
	
	Pair(int akey, int avalue){
		this.key= akey;
		this.value = avalue;
	}
	
	Pair(){
	
	}
	

	
	public int getKey() {
		return key;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int avalue) {
		this.value= avalue;
	}
	
	public void setKey(int akey) {
		this.key= key;
	}
	
	

}
