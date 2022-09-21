package packageFront;

import java.util.ArrayList;
// This class is for mod functionality in ArrayList
//D stands for all kind of Data types
public class InhertianceExample<D> extends ArrayList<D>{
	
	public D getmodValue (int index) {
		int validIndex = Math.abs(index) % this.size();
		return this.get(validIndex);
	}

}
