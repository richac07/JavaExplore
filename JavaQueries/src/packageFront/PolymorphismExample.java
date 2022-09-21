package packageFront;
import java.util.ArrayList;

// For Odd Array List, it will have only odd numbers
// this is run-time poly, as add method will change at the run time, it will take the priority over the ArrayList method add.

public class PolymorphismExample extends ArrayList <Integer>{
	
@Override
public void add (int index, Integer element) {
	if (Math.abs(element) % 2 == 1) {
		super.add(index, element);
	}
}
	
	

}
